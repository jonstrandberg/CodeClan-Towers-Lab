import java.util.ArrayList;

public abstract class Room {

    private Integer capacity;
    private ArrayList<Guest> guests;


    public Room (Integer capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();

    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public Integer getCapacity() {
        return capacity;
    }


}
