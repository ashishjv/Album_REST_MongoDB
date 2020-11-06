package com.example.album_REST_MongoDB.resource;

import com.example.album_REST_MongoDB.service.PhotoService;
import com.example.album_REST_MongoDB.model.Photo;
import com.example.album_REST_MongoDB.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photo")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping
    public Photo getPhotoById(@RequestParam(name = "photoId") String photoId){
        return photoService.getPhotoById(photoId);
    }

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public String updatePhoto(@RequestParam(name = "photoId") String photoId){
        return photoService.deletePhoto(photoId);
    }

}
