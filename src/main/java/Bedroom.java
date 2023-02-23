import java.util.ArrayList;

public class Bedroom extends Room {

    private Integer roomNumber;
    private RoomType roomType;

    public Bedroom(Integer roomNumber, RoomType roomType){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void addGuestToBedroom(Guest guest){
        this.getGuests().add(guest);
    }

    public int guestCount() {
        return this.getGuests().size();
    }


}
