import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private Bedroom bedroom5;
    private Bedroom bedroom6;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, RoomType.SINGLE);
        bedroom2 = new Bedroom(2, RoomType.SINGLE);
        bedroom3 = new Bedroom(3, RoomType.SINGLE);
        bedroom4 = new Bedroom(4, RoomType.DOUBLE);
        bedroom5 = new Bedroom(5, RoomType.DOUBLE);
        bedroom6 = new Bedroom(6, RoomType.DOUBLE);
        conferenceRoom1 = new ConferenceRoom("Conference Room 1");
        conferenceRoom2 = new ConferenceRoom("Washington Suite");
        guest1 = new Guest("Bob McJim");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom4);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.addBedroom(bedroom1);
        hotel.checkInGuest(1, guest1);
        assertEquals(1, bedroom1.guestCount());
    }

}
