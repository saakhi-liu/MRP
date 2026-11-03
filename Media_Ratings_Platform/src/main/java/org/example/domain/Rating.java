package org.example.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Rating {

    private User creator;

    private MediaEntry mediaEntry;

    private int stars;

    private String comment;

    private LocalDateTime timeStamp;

    private boolean confirmed;

    private List<User> likedBy = new ArrayList<>();

    public Rating(User creator, MediaEntry mediaEntry, int stars, String comment, boolean confirmed){
        this.creator = creator;
        this.mediaEntry = mediaEntry;
        this.stars = stars;
        this.comment = comment;
        this.timeStamp = LocalDateTime.now();
        this.confirmed = confirmed;
    }

    //TODO: ExceptionHandling
    public void addLike(User user){
        likedBy.add(user);
    }

    public User getCreator() {
        return creator;
    }

    public MediaEntry getMediaEntry() {
        return mediaEntry;
    }

    public int getStars() {
        return stars;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public List<User> getLikedBy() {
        return likedBy;
    }
}
