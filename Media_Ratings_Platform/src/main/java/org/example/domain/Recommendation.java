package org.example.domain;

public class Recommendation {

    private MediaEntry mediaEntry;

    private Genre genre;

    private MediaType mediaType;

    private int ageRestriction;

    public Recommendation(MediaEntry mediaEntry, Genre genre, MediaType mediaType, int ageRestriction){
        this.mediaEntry = mediaEntry;
        this.genre = genre;
        this.mediaType = mediaType;
        this.ageRestriction = ageRestriction;
    }

    public MediaEntry getMediaEntry() {
        return mediaEntry;
    }

    public Genre getGenre() {
        return genre;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }
}
