package com.example.album_REST_MongoDB.resource;

import com.example.album_REST_MongoDB.model.Album;
import com.example.album_REST_MongoDB.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/album")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/id")
    public Album getAlbumById(@RequestParam(name = "albumId") String albumId){
        return albumService.getAlbumById(albumId);
    }

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        if(album.getDateCreated()==null){
            album.setDateCreated(java.time.LocalDate.now());
        }
        return albumService.saveAlbum(album);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public String deleteAlbum(@RequestParam(name = "albumId") String albumId){
        return albumService.deleteAlbum(albumId);
    }

}
