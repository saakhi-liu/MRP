package org.example.domain;

public class Statistic {

    private User user;

    // Nach Ratings Liste filtern von user
    private int totalRatings;

    // Nach Ratings Liste filtern von user
    private double averageRatings;

    // Nach Ratings Liste filtern von user
    private Genre favoriteGenre;

    public Statistic(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public double getAverageRatings() {
        return averageRatings;
    }

    public Genre getFavoriteGenre() {
        return favoriteGenre;
    }
}
