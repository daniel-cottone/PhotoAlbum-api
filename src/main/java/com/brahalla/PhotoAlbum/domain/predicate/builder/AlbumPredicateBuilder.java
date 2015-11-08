package com.brahalla.PhotoAlbum.domain.predicate.builder;

import com.brahalla.PhotoAlbum.domain.predicate.AlbumPredicate;
import com.brahalla.PhotoAlbum.domain.predicate.SearchCriteria;

import com.mysema.query.types.expr.BooleanExpression;

import java.util.ArrayList;
import java.util.List;

public class AlbumPredicateBuilder {

  private List<SearchCriteria> criteria;

  public AlbumPredicateBuilder() {
    this.setCriteria(new ArrayList<SearchCriteria>());
  }

  public List<SearchCriteria> getCriteria() {
    return this.criteria;
  }

  public void setCriteria(List<SearchCriteria> criteria) {
    this.criteria = criteria;
  }

  public AlbumPredicateBuilder with(String key, String operation, Object value) {
    this.criteria.add(new SearchCriteria(key, operation, value));
    return this;
  }

  public BooleanExpression build() {
    if (this.getCriteria().size() == 0) {
      return null;
    }

    List<BooleanExpression> predicates = new ArrayList<BooleanExpression>();
    AlbumPredicate predicate;
    for (SearchCriteria c : this.getCriteria()) {
      predicate = new AlbumPredicate(c);
      BooleanExpression exp = predicate.getPredicate();
      if (exp != null) {
        predicates.add(exp);
      }
    }

    BooleanExpression result = predicates.get(0);
    for (int i = 1; i < predicates.size(); i++) {
      result = result.and(predicates.get(i));
    }

    return result;
  }
}
