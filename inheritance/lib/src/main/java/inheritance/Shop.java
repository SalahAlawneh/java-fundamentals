package inheritance;

public class Shop extends Schema implements Test {

    public String getShopName() {
        return name;
    }

    public void Shop(String shopName) {
        this.name = shopName;
    }

    public Shop(String name, String numberOfDollarSign, String description) {
        this.name = name;
        this.numberOfDollarSign = numberOfDollarSign;
        this.description = description;
    }

    public void addReview(Review review) {
        addedReview.add(review);

    }

    @Override
    public String toString() {
        return super.toString() + "price category: " + numberOfDollarSign + ", description: " + description;

    }

    @Override
    public void addedReview(Review salah) {

    }

    @Override
    public void addReview() {

    }
}
