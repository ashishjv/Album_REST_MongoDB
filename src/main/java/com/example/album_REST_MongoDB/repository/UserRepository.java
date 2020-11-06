package com.example.album_REST_MongoDB.repository;

import com.example.album_REST_MongoDB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
