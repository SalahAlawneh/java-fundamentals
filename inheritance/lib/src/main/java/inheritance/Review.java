package inheritance;

public class Review extends Restaurant {
    String body;
    String name;
    String author;
    int stars;
    String price;

    Review(String body, String name, String author, int stars, String price) {
        super(name, price);
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //
//    Review() {
//        super();
//    }

    //
    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", price=" + price + '$' +
                '}';

    }
}
