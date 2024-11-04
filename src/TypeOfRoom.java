import java.util.Scanner;

public class TypeOfRoom {



    private static String single_bed;
    private static String double_bed;
    private static String queen;
    private static String king;
    private static String suite;



    public static void getRoomType() {

        System.out.println(" Please select the room you would like to reserve");
        System.out.println("\t*MENU");
        System.out.println(" Single");
        System.out.println(" Double");
        System.out.println(" Queen");
        System.out.println(" King");
        System.out.println(" Suite");

        Scanner sc = new Scanner(System.in);
        String roomtype = sc.nextLine();

        if (roomtype == single_bed){

            System.out.println(" You have selected a single room");

        } else if (roomtype== double_bed) {
            
        }
    }
}