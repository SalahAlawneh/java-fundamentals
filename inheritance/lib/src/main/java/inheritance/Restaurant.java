package inheritance;

public class Restaurant {
    String name;
    int numberOfStars;
    String priceCategory;
    String body;
    String author;

    public Restaurant() {
    }

    public Restaurant(String name, int numberOfStars, String priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }

    public void addReview(String body, String author, int numberOfStars) {
        Review addReview = new Review(body, author, numberOfStars);
        this.body = addReview.body;
        this.author = addReview.author;
        this.numberOfStars = addReview.numberOfStars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory='" + priceCategory + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
