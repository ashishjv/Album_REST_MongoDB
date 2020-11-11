package com.example.album_REST_MongoDB.model;

import com.example.album_REST_MongoDB.validation.ValidateCustom;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.Date;

public class Comment {
    private String id;
    private String photoId;
    @Length(min = 5, message = "Minimum 5 characters required to post comment")
    private String message;
    @ValidateCustom
    private String createdBy;
    private LocalDate dateCreated;

    public Comment(String photoId, String message, String createdBy, LocalDate dateCreated) {
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
