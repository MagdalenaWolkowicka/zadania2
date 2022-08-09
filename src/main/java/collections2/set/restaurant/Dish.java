package collections2.set.restaurant;

public class Dish {
    private String name;
    private int price;
    private int calories;
    private TypeOfDish typeOfDish;

    public Dish(String name, int price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", typeOfDish=" + typeOfDish +
                '}';
    }
}
