package com.imageuploaded.Service.Impl;

import com.imageuploaded.Entity.Image;
import com.imageuploaded.Repository.ImageRepository;
import com.imageuploaded.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }


    @Override
    public void uploadImage(MultipartFile file) throws IOException {
        byte[] imageData = file.getBytes();
        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setImageData(imageData);
        imageRepository.save(image);
    }
}
