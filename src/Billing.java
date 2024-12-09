import java.util.Scanner;
/**
 * The Billing class calculates and displays the total cost for a room reservation.
 * It includes room pricing for different types of rooms and calculates the total amount
 * based on the number of days the guest stays.
 * @author Sarah Beasley
 * @version 3.0
 */

public class Billing {
    private static double roomPrice;
    private static double totalAmount;
    private static int daysStayed;

    // Prices for each room type
    private static final double SINGLE_BED_PRICE = 100.00;
    private static final double DOUBLE_BED_PRICE = 150.00;
    private static final double QUEEN_BED_PRICE = 200.00;
    private static final double KING_BED_PRICE = 250.00;
    private static final double SUITE_PRICE = 300.00;

    /**
     * Calculates the total bill based on the room type and number of days stayed.
     *
     * @param roomType the type of room selected (e.g., single, double, queen, etc.)
     * @param daysStayed the number of days the guest will stay
     */
    public static void calculateBill (String roomType, int daysStayed){
        //Set room price based on selected room type
        switch (roomType.toLowerCase()) {
            case "single":
                roomPrice = SINGLE_BED_PRICE;
                break;
            case "double":
                roomPrice = DOUBLE_BED_PRICE;
                break;
            case "queen":
                roomPrice = QUEEN_BED_PRICE;
                break;
            case "king":
                roomPrice = KING_BED_PRICE;
                break;
            case "suite":
                roomPrice = SUITE_PRICE;
                break;
            default:
                System.out.println("Invalid room type.");
                return;
        }

        // Calculate the room cost for the number of days stayed
        double roomCost = roomPrice * daysStayed;

        // Total amount
        totalAmount = roomCost;

        // Display total Bill
        displayBill(roomType, roomCost);
    }

    /**
     * Displays the billing details including room type, room price, total days stayed,
     * room cost, and the total amount due.
     *
     * @param roomType the type of room selected (e.g., single, double, queen, etc.)
     * @param roomCost the calculated cost of the room for the given number of days
     */
    public static void displayBill(String roomType, double roomCost) {
        System.out.println("BILLING DETAILS");
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Price per Night: $" + roomPrice);
        System.out.println("Total Days Stayed: " + daysStayed);
        System.out.println("Room Cost: $" + roomCost);
        System.out.println("TOTAL AMOUNT DUE: $" + totalAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
