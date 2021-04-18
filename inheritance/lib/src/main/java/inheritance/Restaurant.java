package inheritance;

import java.util.ArrayList;

public class Restaurant extends Schema {
    private long restaurantNumberOfStars;
    private String restaurantPriceCategory;
    private ArrayList<Review> restaurantReview = new ArrayList<Review>();

    public Restaurant(String restaurantName, String restaurantPriceCategory) {
        this.name = restaurantName;
        this.restaurantPriceCategory = restaurantPriceCategory;
    }

    public String getRestaurantName() {
        return name;
    }

    public void setRestaurantName(String restaurantName) {
        this.name = restaurantName;
    }

    public long getRestaurantNumberOfStars() {
        return restaurantNumberOfStars;
    }

    public void setRestaurantNumberOfStars(int restaurantNumberOfStars) {
        this.restaurantNumberOfStars = restaurantNumberOfStars;
    }

    public String getRestaurantPriceCategory() {
        return restaurantPriceCategory;
    }

    public void setRestaurantPriceCategory(String restaurantPriceCategory) {
        this.restaurantPriceCategory = restaurantPriceCategory;
    }

    public void addReview(Review review) {
        restaurantReview.add(review);
        int sum = 0;
        int i = 0;
        for (Review reviewIteration : restaurantReview) {
            sum += reviewIteration.getReviewNumberOfStars();
        }
        this.restaurantNumberOfStars = sum / restaurantReview.size();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + name + '\'' +
                ", restaurantNumberOfStars=" + restaurantNumberOfStars +
                ", restaurantPriceCategory='" + restaurantPriceCategory + '\'' +
                ", restaurantReview=" + restaurantReview +
                '}';
    }

    @Override
    public void addedReview(Review salah) {

    }
}
