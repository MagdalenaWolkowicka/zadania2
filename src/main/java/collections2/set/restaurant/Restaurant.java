package collections2.set.restaurant;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private Set<Dish> dishes = new HashSet<>();

    public Restaurant() {
        dishes.add(new Dish("Pomidorowa", 20, 200));
        dishes.add(new Dish("Rosół", 20, 400));
        dishes.add(new Dish("Owsianka", 15, 200));
        dishes.add(new Dish("Jajecznica", 12, 150));

    }


    public void addDish (Dish dish) {
        dishes.add(dish);
    }

    public Set<Dish> getDishes() {
        return dishes;
    }
}
