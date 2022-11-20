package Lab2;

public class DwellingFloor {
    private Flat[] flats;

    private Flat flat;
    //Номер квартиры явно не хранится.
    //Нумерация квартир на этаже сквозная и начинается с нуля.

    /**
     * Конструктор может принимать количество квартир на этаже.
     */
    public DwellingFloor(int quantity) {
        this.flats = new Flat[quantity];
    }

    /**
     * Конструктор может принимать массив квартир этажа.
     */

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    /**
     * Создайте метод получения количества квартир на этаже.
     */
    public int getQuantityFlatsInFloor() {
        return flats.length;
    }

    /**
     * Создайте метод получения общей площади квартир этажа.
     */

    public int getSumSpace() {
        int Sum = 0;
        for (int i = 0; i < flats.length; i++) {
            Sum += flats[i].getSpace();
        }
        return Sum;
    }

    /**
     * Создайте метод получения общего количества комнат этажа.
     */

    public int getSumRooms() {
        int Sum = 0;
        for (int i = 0; i < flats.length; i++) {
            Sum += flats[i].getRooms();
        }
        return Sum;
    }

    /**
     * Создайте метод получения массива квартир этажа.
     */

    public Flat[] getArrayFlats() {
        return flats;
    }

    /**
     * Создайте метод получения объекта квартиры по ее номеру на этаже.
     */
    public Flat getNumFlats(int num) {
        return flats[num];
    }

    /**
     * Создайте метод изменения квартиры по ее номеру на этаже и ссылке на новую квартиру.
     */
    public void setFlats(int num, Flat flat) {
        this.flats[num] = flat;
    }

    /**
     * Создайте метод добавления новой квартиры на этаже по будущему номеру квартиры (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на объект квартиры.
     */
    public void setAddFlats(int num, Flat flat) {
        Flat[] NewFlats = new Flat[flats.length + 1];
        for (int i = 0; i < num; i++){
         NewFlats[i] = this.flats[i];}

         NewFlats[num] = flat;
         for (int i = num + 1; i < NewFlats.length; i++){
         NewFlats[i] = this.flats[i - 1];}
         this.flats = NewFlats;
        /**for (int i = 0; i < num; i++) {
            NewFlats[i] = this.flats[i];
        }
        this.flats = NewFlats.clone();
        this.flats[num] = flat;*/
    }
    /**
     *  Создайте метод удаления квартиры по ее номеру на этаже.
     */
    public void setDelFlats(int num, Flat[] flats){
     this.flats[num]=null;
    }

    /**
     * Создайте метод getBestSpace() получения самой большой по площади квартиры этажа.
     */
    public Flat getBestSpace(){
        int max=0;
        Flat bestFlat=flats[0];
        for(int a=0; a<flats.length;a++){
            if(flats[a].getSpace()>max ){
                max=flats[a].getSpace();
                bestFlat=flats[a];
            }
        }
        return bestFlat;
    }
}
