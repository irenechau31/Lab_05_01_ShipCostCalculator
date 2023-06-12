import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";
        System.out.println("Enter the price of an item ($).");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();//clear the buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }
        if (itemPrice < 100) {
            shippingCost = 0.02 * itemPrice; // 2% of item price
        }
        else {shippingCost = 0;}
        totalPrice = itemPrice + shippingCost;
        System.out.println("Shipping cost is ($): " + shippingCost);
        System.out.println("Total price is ($): " + totalPrice);
    }
}