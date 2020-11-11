package com.example.album_REST_MongoDB.model;

import com.example.album_REST_MongoDB.validation.ValidateCustom;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import java.time.LocalDate;

public class Album {
    private String id;
    @Length(max = 10, message = "Only a maximum of 10 characters allowed for album name")
    private String name;
    private String coverPhotoUrl;
    @ValidateCustom
    private String createdBy;
    private LocalDate dateCreated;

    public Album(String name, String coverPhotoUrl, String createdBy, LocalDate dateCreated) {
        this.name = name;
        this.coverPhotoUrl = coverPhotoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
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
