package inheritance;

public class Shop {
    String name;
    String description;
    String price;

    public Shop(){
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
