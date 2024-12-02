import java.util.Scanner;
public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main (String [] args) {

        System.out.println(" Thank you for choosing our management system");
        System.out.println();



        //Prompt user for guest info
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

        // Select Room Type
        TypeOfRoom.getRoomType();  // Allows user to select room type and quantity

        // Call activity method to event schedule
        Activity.activity(null);

        // 4. Get Room Type
        System.out.println("Enter room type for billing (Single/Double/Queen/King/Suite): ");
        String roomType = scanner.nextLine();
        System.out.println("Enter number of days stayed: ");
        int daysStayed = scanner.nextInt();

        //Calculate the total Bill
        Billing.calculateBill(roomType, daysStayed);  // Call Billing to calculate and display the bill
    }

    }

