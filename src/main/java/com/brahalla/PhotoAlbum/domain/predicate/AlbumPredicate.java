package com.brahalla.PhotoAlbum.domain.predicate;

import com.brahalla.PhotoAlbum.domain.base.DomainBase;
import com.brahalla.PhotoAlbum.domain.entity.Album;

import com.mysema.query.types.expr.BooleanExpression;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathBuilder;
import com.mysema.query.types.path.StringPath;

import org.apache.commons.lang3.math.NumberUtils;

public class AlbumPredicate extends DomainBase {

  //private static final long serialVersionUID = ;
  private SearchCriteria criteria;

  public AlbumPredicate() {
    super();
  }

  public AlbumPredicate(SearchCriteria criteria) {
    this.setSearchCriteria(criteria);
  }

  public SearchCriteria getSearchCriteria() {
    return this.criteria;
  }

  public void setSearchCriteria(SearchCriteria criteria) {
    this.criteria = criteria;
  }

  public BooleanExpression getPredicate() {

    PathBuilder<Album> entityPath = new PathBuilder<Album>(Album.class, "album");

    if (NumberUtils.isNumber(this.criteria.getValue().toString())) {

      NumberPath<Integer> path = entityPath.getNumber(this.criteria.getKey(), Integer.class);
      int value = Integer.parseInt(this.criteria.getValue().toString());

      if (this.criteria.getOperation().equalsIgnoreCase(":")) {
        return path.eq(value);
      } else if (this.criteria.getOperation().equalsIgnoreCase(">")) {
        return path.goe(value);
      } else if (this.criteria.getOperation().equalsIgnoreCase("<")) {
        return path.loe(value);
      }

    } else {

      StringPath path = entityPath.getString(this.criteria.getKey());
      if (this.criteria.getOperation().equalsIgnoreCase(":")) {
        return path.containsIgnoreCase(this.criteria.getValue().toString());
      }
    }

    return null;
  }

}
