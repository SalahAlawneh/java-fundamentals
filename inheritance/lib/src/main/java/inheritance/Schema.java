package inheritance;

import java.util.ArrayList;

public abstract class Schema extends Review {
    String name;
    String numberOfDollarSign;
    String description;
    private String reviewBody;
    private String reviewAuthor;
    private int reviewNumberOfStars;
    ArrayList<Review> addedReview = new ArrayList<Review>();

    public Schema(String reviewBody, String reviewAuthor, int reviewNumberOfStars) {
        super(reviewBody, reviewAuthor, reviewNumberOfStars);
    }

    public void Review(String reviewBody, String reviewAuthor, int reviewNumberOfStars) {
        this.reviewBody = reviewBody;
        this.reviewAuthor = reviewAuthor;
        this.reviewNumberOfStars = reviewNumberOfStars;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public String getReviewAuthor() {
        return reviewAuthor;
    }

    public void setReviewAuthor(String reviewAuthor) {
        this.reviewAuthor = reviewAuthor;
    }

    public int getReviewNumberOfStars() {
        return reviewNumberOfStars;
    }

    public void setReviewNumberOfStars(int reviewNumberOfStars) {
        this.reviewNumberOfStars = reviewNumberOfStars;
    }

    public void addReview(Review review) {
    }

    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                "reviewBody='" + reviewBody + '\'' +
                ", reviewAuthor='" + reviewAuthor + '\'' +
                ", reviewNumberOfStars=" + reviewNumberOfStars +
                '}';
    }


}
