// Guest_info class stores information about a guest
public class Guest_info {

      private String guestID;
      private String guestName;
      private String email;

      //Constructor
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


}







