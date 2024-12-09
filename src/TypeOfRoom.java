import javax.swing.*;
import java.util.Scanner;
/**
 * This class allows the user to select a room type and reserve rooms.
 * It handles room selection and the number of rooms a user wants to reserve.
 * @author Bruck Asefa
 * @version 4.0
 */

public class TypeOfRoom {


    private static String SINGLE;
    private static String DOUBLE;
    private static String QUEEN;
    private static String KING;
    private static String SUITE;
    private static int numberOfRooms;
    private static int roomType;

    /**
     * Prompts the user to select a room type and calls the roomQuantity method to determine the number of rooms.
     */
    public static void getRoomType() {


        System.out.println(" Please select the room you would like to reserve");


            System.out.println();
            System.out.println(" 1) Select 1 for a Single bed");
            System.out.println(" 2) Select 2 for a Double bed");
            System.out.println(" 3) Select 3 for a Queen bed");
            System.out.println(" 4) Select 4 for a King bed");
            System.out.println(" 5) Select 5 for a Suite");
            Scanner sc = new Scanner(System.in);
            roomType = sc.nextInt();



            if (roomType == 1) {
                System.out.println(" You have selected a single room.");
                roomQuantity();
            } else if (roomType == 2) {
                System.out.println(" You have selected a double room.");
                roomQuantity();
            } else if (roomType == 3) {
                System.out.println(" You have selected a queen room.");
                roomQuantity();
            } else if (roomType == 4) {
                System.out.println(" You have selected a king room.");
                roomQuantity();
            } else if (roomType == 5) {
                System.out.println(" You have selected a Suite");
                roomQuantity();
            } else {
                System.out.println(" Invalid response");
            }



    }

    /**
     * Asks the user how many rooms they would like to reserve and displays the selection.
     */
    public static void roomQuantity() {


            System.out.println(" How many rooms would you like to reserve ");


            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            numberOfRooms = num;


            if (numberOfRooms == 1) {
                System.out.println(" You have selected one " + roomType(roomType) );
            } else if (numberOfRooms == 2) {
                System.out.println(" You have selected two " + roomType(roomType)+ ("s"));
            } else if (numberOfRooms == 3) {
                System.out.println(" You have selected three " + roomType(roomType) + ("s"));
            } else {
                System.out.println(" There are only three" + roomType(roomType)+(" available"));
            }

    }
    /**
     * Returns the string representation of the room type based on the number selected.
     *
     * @param roomType The integer value representing the selected room type.
     * @return The  description of the room type.
     */
    public static String roomType( int roomType){
        String myRoomType=" ";
        if(roomType==1) {
              myRoomType="Single bed room";
        } else if (roomType ==2) {
            myRoomType= "Double bed room";
        } else if (roomType ==3) {
            myRoomType= "Queen bed room";
        } else if ( roomType ==4 ) {
            myRoomType= "King bed room";
        } else if ( roomType ==5) {
            myRoomType = " Suite room";
        } else {
          System.out.println("Return to main menu");
        }
        return myRoomType;
    }
}

