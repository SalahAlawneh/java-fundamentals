package inheritance;

public class Restaurant {
    String name;
    int stars;
    String price;

    public Restaurant() {

    }

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void addReview(String body, String name, String author, int stars, String price) {
        Review restRev = new Review(body, name, author, stars, price);
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars + "stars" +
                ", price=" + price + '$' +
                '}';
    }
}
