import java.util.Scanner;

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

    // Method to calculate totalBill
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

        // Total amount calculation
        totalAmount = roomCost;

        // Display the total Bill
        displayBill(roomType, roomCost);
    }

    // Method to display the bill details
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

        // Ask for room type and days stayed
        System.out.print("Enter room type (Single/Double/Queen/King/Suite): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter number of days stayed: ");
        daysStayed = scanner.nextInt();

        // Calculate and display the bill
        calculateBill(roomType, daysStayed);
    }
}
