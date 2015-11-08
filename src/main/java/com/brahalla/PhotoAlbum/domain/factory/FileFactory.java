package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.File;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileFactory implements FactoryBean<File> {

  public File create(MultipartFile multipartFile) throws Exception {
    return new File(
      multipartFile.getOriginalFilename(),
      new Date(),
      multipartFile.getBytes()
    );
  }

  /*public List<File> create(List<MultipartFile> multipartFileList) throws Exception {
    List<File> fileList = new LinkedList<File>();
    if (multipartFileList != null) {
      multipartFileList.forEach(f -> fileList.add(this.create(f)));
    }
    return fileList;
  }*/

  @Override
  public File getObject() {
    return new File();
  }

  @Override
  public Class<File> getObjectType() {
    return File.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }

}
