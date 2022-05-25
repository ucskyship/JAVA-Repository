//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HotelTest {
//    Hotel hotel;
//
//    @BeforeEach
//    void setUp() {
//        hotel = new Hotel(5);
//    }
//
//    @Test
//    void testThatHotelWasCreatedWithSpecifiedNumberOfRooms() {
//        assertEquals(5, hotel.getRooms().length);
//    }
//
//    @Test
//    void testThatWeCanGetRooms() {
//        //Get all rooms from hotel
//        String[] allRoomsArray = hotel.getRooms();
//        //Assert that we have rooms
//        assertNotNull(allRoomsArray);
//        //Assert that rooms are empty
//        for (String room : allRoomsArray) {
//            assertNull(room);
//        }
//    }
//
//    @Test
//    void testThatWeCanBookARoom() {
//        String name = "Mofe";
//        String result = hotel.bookRoom(name);
//        System.out.println(result);
//        String roomGuest = hotel.getRoomGuest(1);
//        assertEquals(name, roomGuest);
//        String secondName = "Tade";
//        String result2 = hotel.bookRoom(secondName);
//        System.out.println(result2);
//        String roomGuest2 = hotel.getRoomGuest(2);
//        assertEquals(secondName, roomGuest2);
//    }
//
//    @Test
//    void testThatUserCanCheckout() {
//        String name = "Mofe";
//        String result = hotel.bookRoom(name);
//        String secondName = "Tade";
//        String result2 = hotel.bookRoom(secondName);
//        int roomNumber = 1;
//        hotel.checkout(roomNumber);
//        String guest = hotel.getRoomGuest(roomNumber);
//        assertNull(guest);
//    }
//}