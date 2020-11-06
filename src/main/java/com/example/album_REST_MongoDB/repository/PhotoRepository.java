package com.example.album_REST_MongoDB.repository;

import com.example.album_REST_MongoDB.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
