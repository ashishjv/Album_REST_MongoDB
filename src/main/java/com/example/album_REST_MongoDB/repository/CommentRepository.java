package com.example.album_REST_MongoDB.repository;

import com.example.album_REST_MongoDB.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
