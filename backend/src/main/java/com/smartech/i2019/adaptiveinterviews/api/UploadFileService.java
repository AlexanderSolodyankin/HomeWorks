package com.smartech.i2019.adaptiveinterviews.api;

import com.smartech.i2019.adaptiveinterviews.model.UploadFile;

import java.util.List;

public interface UploadFileService {

    void add(UploadFile file);

    void delete(long id);

    UploadFile findById(long id);

    List<UploadFile> findAll();
}
