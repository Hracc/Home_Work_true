package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {

    @Test
    public void testDefaultConstructor() {
        Flat flat=new Flat();
        assertEquals(2, flat.getRooms() );
        assertEquals(50, flat.getSpace());
    }

    @Test
    public void testOtherConstructor() {
        Flat flat1=new Flat(250);
        assertEquals(2, flat1.getRooms() );
        assertEquals(250, flat1.getSpace());
    }

    @Test
    public void testGetterAndSetter() {
        Flat ActualFlat = new Flat();
        assertEquals(2, ActualFlat.getRooms());
        assertEquals(50, ActualFlat.getSpace());

        ActualFlat.setRooms(3);
        ActualFlat.setSpace(250);

        assertEquals(3, ActualFlat.getRooms());
        assertEquals(250, ActualFlat.getSpace());
    }
}


