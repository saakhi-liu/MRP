package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class MediaEntry
{

    private String title;

    private String description;

    private MediaType mediaType;

    private int releaseYear;

    private List<Genre> genres;

    private int ageRestriction;

    private User creator;

    private double averageScore;

    private List<Rating> ratings = new ArrayList<>();

    // Filter setzen: Anzahl der User, die dieses als Favorit markiert haben
    private int favoriteCount;

    public MediaEntry(String title, String description, MediaType mediaType, int releaseYear, List<Genre> genres, int ageRestriction, User creator){
        this.title = title;
        this.description = description;
        this.mediaType = mediaType;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.ageRestriction = ageRestriction;
        this.creator = creator;
    }

    //TODO: Durchschnittsbewertung: berechnet aus den Rating scores
    public double getAverageScore(){
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public User getCreator() {
        return creator;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}
