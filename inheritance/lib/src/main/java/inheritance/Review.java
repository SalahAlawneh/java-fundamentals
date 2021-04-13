package inheritance;

public class Review {
    String body;
    String author;
    int numberOfStars;

    public Review() {
    }

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
