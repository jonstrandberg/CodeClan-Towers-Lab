import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.DOUBLE);
        bedroom2 = new Bedroom(2, RoomType.SINGLE);
        guest = new Guest("Bob McJim");
    }

    @Test
    public void can_add_guest_to_bedroom(){
        bedroom.addGuestToBedroom(guest);
        assertEquals(1, bedroom.guestCount());
    }




}
