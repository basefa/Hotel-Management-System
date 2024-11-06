// Guest_info class stores information about a guest
public class Guest_info {
    private int guestID; // ID for each guest
    private String name; // Guest's full name
    private String contactInfo; // Guest's contact (email or phone)

    // Constructor to initialize guest info
    public Guest_info(int guestID, String name, String contactInfo) {
        this.guestID = guestID; // Sets guest ID
        this.name = name; // Sets guest name
        this.contactInfo = contactInfo; // Sets guest's contact info
    }

    // Getter for guestID
    public int getGuestID() {
        return guestID;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Getter for contactInfo
    public String getContactInfo() {
        return contactInfo;
    }
}

