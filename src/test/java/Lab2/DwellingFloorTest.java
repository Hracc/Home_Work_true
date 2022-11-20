package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwellingFloorTest {
    //По умолчанию у квартиры 2 комнаты и 50 площадь
    @Test
    public void testConstructorArray() {
        Flat[] ArrFlat = new Flat[3];
        DwellingFloor dwellingFloor = new DwellingFloor(ArrFlat);
        assertEquals(3, dwellingFloor.getQuantityFlatsInFloor());

    }

    @Test
    public void testConstructorQuantity() {
        DwellingFloor dwellingFloor = new DwellingFloor(3);
        assertEquals(3, dwellingFloor.getQuantityFlatsInFloor());
    }

    @Test
    public void testArrFlats() {
        Flat[] flats = new Flat[3];
        DwellingFloor dwellingFloor = new DwellingFloor(flats);
        flats[0] = new Flat();
        flats[1] = new Flat(100);
        flats[2] = new Flat(3, 250);
        /**Тест на вывод определенной квартиры*/
        dwellingFloor.getNumFlats(2);
        assertEquals(flats[2], dwellingFloor.getNumFlats(2));
        /**Тест на метод замены квартиры*/
        Flat changeflat = new Flat(1, 75);
        dwellingFloor.setFlats(1, changeflat);
        /**Тест на метод суммирование комнат и площади*/
        assertEquals(6, dwellingFloor.getSumRooms());
        assertEquals(375, dwellingFloor.getSumSpace());
        /**Тест на метод вывода объекта квартиры с наибольшей площадью*/
        assertEquals(flats[2], dwellingFloor.getBestSpace());
        /**Тест на метод удаления квартиры*/
        dwellingFloor.setDelFlats(0, flats);
        assertEquals(null, dwellingFloor.getNumFlats(0));
    }

    @Test
    public void testOther(){


        Flat[] flats = new Flat[3];
        DwellingFloor dwellingFloor = new DwellingFloor(flats);
        flats[0] = new Flat();
        flats[1] = new Flat(100);
        flats[2] = new Flat(3, 250);

        Flat newAddFlat=new Flat();
        dwellingFloor.setAddFlats(3,newAddFlat);
        assertEquals(4,dwellingFloor.getQuantityFlatsInFloor());
        assertEquals(9,dwellingFloor.getSumRooms());
        assertEquals(flats[3],dwellingFloor.getNumFlats(3));
    }
}