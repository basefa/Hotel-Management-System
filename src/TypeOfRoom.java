import javax.swing.*;
import java.util.Scanner;

public class TypeOfRoom {



    private static String single_bed;
    private static String double_bed;
    private static String queen_bed;
    private static String king_bed;
    private static String suite;



    public static void getRoomType() {

        System.out.println(" Please select the room you would like to reserve");
        System.out.println();
        System.out.println(" Select 1 for a Single bed");
        System.out.println(" Select 2 for a Double bed");
        System.out.println(" Select 2 for a Queen bed");
        System.out.println(" Select 2 for a King bed");
        System.out.println(" Select 2 for a Suite");

        Scanner sc = new Scanner(System.in);
        int roomtype = sc.nextInt();

        if (roomtype == 1){
            System.out.println(" You have selected a single room.");
        } else if (roomtype == 2) {
            System.out.println(" You have selected a double room.");
        } else if (roomtype== 3) {
            System.out.println(" You have selected a queen room.");
        } else if (roomtype== 4) {
            System.out.println(" You have selected a king room.");
        } else if (roomtype== 5) {
            System.out.println(" You have selected a Suite");
        } else
        {
            System.out.println(" Invalid response");
        }



    }
}
