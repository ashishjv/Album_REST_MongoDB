package com.example.album_REST_MongoDB.service;

import com.example.album_REST_MongoDB.model.Photo;
import com.example.album_REST_MongoDB.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Photo getPhotoById(String photoId) {
        return photoRepository.findById(photoId).get();
    }

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public String deletePhoto(String photoId) {
        photoRepository.deleteById(photoId);
        return "Deletion completed";
    }
}
