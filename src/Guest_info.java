/**
 * The Guest_info class stores information about a guest, such as their ID, name, and email.
 * It also provides methods to get and set these details, as well as display them.
 *
 * @author Sarah Beasley
 * @version 2.0
 */

public class Guest_info {

      private String guestID;
      private String guestName;
      private String email;

    /**
     * Constructs a new Guest_info object with the specified guest ID, name, and email.
     * @param guestID the ID of the guest
     * @param guestName the name of the guest
     * @param email the email address of the guest
     */

      public void GuestInfo(String guestID, String guestName, String email) {
          this.guestID = guestID;
          this.guestName = guestName;
          this.email = email;
      }

     //Getters and Setter
    public String getGuestID(){
          return guestID;
    }
    public void setGuestID(String guestID){
          this.guestID= guestID;
    }

    public String getGuestName(){
          return guestName;
    }

    public void setGuestName(String guestName){
          this.guestName= guestName;

    }

    public String getEmail(){
         return email;

    }

    public void setEmail (String email){
          this.email= email;
    }

    /**
     * Displays the guest's information, including ID, name, and email.
     */
    public void displayInfo(){
          System.out.println("Guest ID: "+ guestID);
          System.out.println("Guest Name: "+ guestName);
          System.out.println("Email: "+ email);
    }

}







