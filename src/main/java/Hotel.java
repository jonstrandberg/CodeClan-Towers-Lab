import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
       this.bedrooms = new ArrayList<>();
       this.conferenceRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }
    public int getConferenceRoomCount(){
        return this.conferenceRooms.size();
    }

    public void checkInGuest(Integer roomNumber, Guest guest) {
        for (Bedroom bedroom1 : bedrooms) {
            if (bedroom1.getRoomNumber() == roomNumber){
                bedroom1.addGuestToBedroom(guest);
            }
        }
    }
}
