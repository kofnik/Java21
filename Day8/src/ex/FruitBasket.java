package ex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kof on 18/01/15.
 */

public class FruitBasket {
    public static void main(String[] args) {
        ArrayList cart = new ArrayList<>();
        Fruit apple = new Fruit("apple", 2, 15);
        Fruit orange = new Fruit("orange", 3, 12);
        Fruit banana = new Fruit("banana", 4 ,13);
        cart.add(apple);
        cart.add(orange);
        cart.add(banana);

        Iterator it = cart.iterator();
        while (it.hasNext()) {
            Fruit fr = (Fruit)it.next();
            System.out.println(fr.name+ ", " + (fr.quantity*fr.price));
        }

    }
}

class Fruit {
    String name;
    int quantity;
    float price;

    Fruit (String inName, int inQuantity, float inPrice) {
        name = inName;
        quantity = inQuantity;
        price = inPrice;
    }
}

