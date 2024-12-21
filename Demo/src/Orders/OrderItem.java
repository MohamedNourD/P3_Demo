package Orders;

import Meals.*;

public class OrderItem {
    private Meal meal;
    private int quantity;

    public OrderItem(Meal meal, int quantity) {
        this.meal = meal;
        this.quantity = quantity;
    }
    public OrderItem () {}

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
