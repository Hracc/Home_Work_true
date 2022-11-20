package Lab2;

public class Flat {
    private static final int DEFAULT_ROOM_COUNT = 2;
    private static final int DEFAULT_SPACE = 50;

    private int rooms;
    private int space;

    /**
     * Конструктор по умолчанию создает квартиру из 2 комнат площадью 50 кв.м. (эти числа должны быть константами в классе)
     */
    public Flat() {
        this.rooms = DEFAULT_ROOM_COUNT;
        this.space = DEFAULT_SPACE;
    }

    /**
     * Конструктор может принимать площадь квартиры (создается квартира с 2 комнатами).
     */
    public Flat(int space) {
        this.space = space;
        this.rooms = DEFAULT_ROOM_COUNT;
    }

    /**
     * Конструктор может принимать площадь квартиры и количество комнат.
     */
    public Flat(int rooms, int space) {
        this.rooms = rooms;
        this.space = space;
    }

    /**
     * Создайте метод получения количества комнат в квартире.
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Создайте метод изменения количества комнат в квартире.
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    /**
     * Создайте метод получения площади квартиры.
     */
    public int getSpace() {
        return space;
    }

    /**
     * Создайте метод изменения площади квартиры.
     */
    public void setSpace(int space) {
        this.space = space;
    }
}

