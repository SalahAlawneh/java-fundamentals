package inheritance;

public class Review {
    private String reviewBody;
    private String reviewAuthor;
    private int reviewNumberOfStars;

    public Review(String reviewBody, String reviewAuthor, int reviewNumberOfStars) {
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

    @Override
    public String toString() {
        return "Review{" +
                "reviewBody='" + reviewBody + '\'' +
                ", reviewAuthor='" + reviewAuthor + '\'' +
                ", reviewNumberOfStars=" + reviewNumberOfStars +
                '}';
    }
}
