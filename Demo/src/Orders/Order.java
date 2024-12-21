package Orders;

import Users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private User customer;
    private List<OrderItem> orderMeals = new ArrayList<>();

}
