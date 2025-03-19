package com.projects.f1leagueback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document(collection = "users")
public class Driver {

    @Id
    private UUID id;

    @Field("name")
    private String name;

    @Field("gamertag")
    private String gamertag;

    @Field("email")
    private String email;

    @Field("description")
    private String description;

    @Field("photo")
    private String photo;

    public Driver() {
    }

    public Driver(String name, String gamertag, String email, String description, String photo) {
        this.name = name;
        this.gamertag = gamertag;
        this.email = email;
        this.description = description;
        this.photo = photo;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}