// A Food Order Management System maintains a list of food items selected by 
// customers. New food items can be added at the beginning of the order list, while the
// last food item can be removed when required.
// (a) Create a LinkedList to store the names of food items.
// (b) Add the following food items at the beginning of the list:
// "Pizza"
// • "Burger"
// • "Pasta"
// "Sandwich"
// (c) Display the first item of the list. UTIONS
// (d) Remove one food item from the end of the list.
// (e) Write a suitable loop to display all the food items currently present in the list.

// Answer:
import java.util.LinkedList;
public class FoodOrder {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.addFirst("Pizza");
        l1.addFirst("Burger");
        l1.addFirst("Pasta");
        l1.addFirst("Sandwich");
        System.out.println("First item in the list: " + l1.getFirst());
        l1.removeLast();
        System.out.println("Current Food Items in Order List:");
        for (String item : l1) {
            System.out.println(item+" ");
        }
    }
}
