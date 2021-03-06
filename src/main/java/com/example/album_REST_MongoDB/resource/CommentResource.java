package com.example.album_REST_MongoDB.resource;

import com.example.album_REST_MongoDB.model.Comment;
import com.example.album_REST_MongoDB.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/id")
    public Comment getCommentById(@RequestParam(name = "commentId") String commentId){
        return commentService.getCommentById(commentId);
    }

    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment){
        if(comment.getDateCreated()==null){
            comment.setDateCreated(java.time.LocalDate.now());
        }
        return commentService.saveComment(comment);
    }

    @PutMapping
    public Comment updateComment(@RequestBody @Valid Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public String deleteComment(@RequestParam(name = "commentId") String commentId){
        return commentService.deleteComment(commentId);
    }
}
