package com.example.album_REST_MongoDB.repository;

import com.example.album_REST_MongoDB.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {
}
