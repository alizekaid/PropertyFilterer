package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_reviews")
    private int numberOfReviews;

    @Column(name = "review_scores_rating")
    private double reviewScoresRating;

    @Column(name = "first_review")
    private String firstReview;

    @Column(name = "last_review")
    private String lastReview;

    // Constructors
    public Review() {
    }

    public Review(int numberOfReviews, double reviewScoresRating, String firstReview, String lastReview) {
        this.numberOfReviews = numberOfReviews;
        this.reviewScoresRating = reviewScoresRating;
        this.firstReview = firstReview;
        this.lastReview = lastReview;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public double getReviewScoresRating() {
        return reviewScoresRating;
    }

    public void setReviewScoresRating(double reviewScoresRating) {
        this.reviewScoresRating = reviewScoresRating;
    }

    public String getFirstReview() {
        return firstReview;
    }

    public void setFirstReview(String firstReview) {
        this.firstReview = firstReview;
    }

    public String getLastReview() {
        return lastReview;
    }

    public void setLastReview(String lastReview) {
        this.lastReview = lastReview;
    }

    // toString method
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", numberOfReviews=" + numberOfReviews +
                ", reviewScoresRating=" + reviewScoresRating +
                ", firstReview=" + firstReview +
                ", lastReview=" + lastReview +
                '}';
    }
}
