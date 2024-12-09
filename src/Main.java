import java.util.Scanner;

/**
 * The Main class runs the hotel management system.
 * It asks the user for guest details, lets them choose a room, and calculates the bill based on their stay.
 * The class uses other parts of the system, like Guest_info, TypeOfRoom, Activity, and Billing.
 *
 * @author Bruck Asefa
 * @version 3.0
 */

public class Main {
    static Scanner scanner= new Scanner(System.in);
/**
 * This is the main method
 *   <li>Asks for the guest's ID, name, and email</li>
 *   <li>Shows the guest's info</li>
 *   <li>Lets the guest choose a room type</li>
 *   <li>Shows a list of activities (event schedule)</li>
 *   <li>Asks how many days the guest stayed and what room they picked</li>
 *   <li>Shows the total bill based on the room and how long they stayed</li>
 * </ul>
 */

 public static void main (String [] args) {

        System.out.println(" Thank you for choosing our management system");
        System.out.println();



        System.out.println("Please enter your Guest ID: ");
        String guestID = scanner.nextLine();
        System.out.println("Please enter your Full Name: ");
        String guestName = scanner.nextLine();
        System.out.println("Please enter your Email: ");
        String email = scanner.nextLine();

        // Create Guest_info object and display the info
        Guest_info guest = new Guest_info();
        guest.GuestInfo(guestID, guestName, email);
        guest.displayInfo();


        TypeOfRoom.getRoomType();  // Allows user to select room type and quantity

        // Call activity method to event schedule
        Activity.activity(null);

        // Get Room Type
        System.out.println("Enter room type for billing (Single/Double/Queen/King/Suite): ");
        String roomType = scanner.nextLine();
        System.out.println("Enter number of days stayed: ");
        int daysStayed = scanner.nextInt();

        Billing.calculateBill(roomType, daysStayed);  // Call Billing to calculate and display the bill
    }

    }

