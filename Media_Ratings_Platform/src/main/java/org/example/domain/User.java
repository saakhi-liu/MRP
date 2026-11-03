package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;

    private String password;

    private List<MediaEntry> favorites = new ArrayList<>();

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public List<MediaEntry> getFavorites(){
        return favorites;
    }

    // MediaEntry & Ratings bei Persistence gefiltert
    // MediaEntry & Ratings: create, update, delete is with CRUD in Services

    // TODO: ExceptionHandling
    public void addFavorite(MediaEntry mediaEntry){
        favorites.add(mediaEntry);
    }

    // TODO: ExceptionHandling
    public void removeFavorite(MediaEntry mediaEntry){
        favorites.remove(mediaEntry);
    }
}
