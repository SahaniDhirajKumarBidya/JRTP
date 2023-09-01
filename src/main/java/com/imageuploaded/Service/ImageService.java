package com.imageuploaded.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
    void uploadImage(MultipartFile file) throws IOException;

}
