package com.example.album_REST_MongoDB.resource;

import com.example.album_REST_MongoDB.model.Photo;
import com.example.album_REST_MongoDB.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/id")
    public Photo getPhotoById(@RequestParam(name = "photoId") String photoId){
        return photoService.getPhotoById(photoId);
    }

    @PostMapping
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        if(photo.getDateCreated()==null){
            photo.setDateCreated(java.time.LocalDate.now());
        }
        return photoService.savePhoto(photo);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody @Valid Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public String deletePhoto(@RequestParam(name = "photoId") String photoId){
        return photoService.deletePhoto(photoId);
    }
}
