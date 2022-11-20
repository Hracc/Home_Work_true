package Lab2;

public class Dwelling {
    private DwellingFloor dwellingFloor;
    private DwellingFloor[] dwellingFloors;
    private Flat flat;
    private  Flat[] flats;
    //Номер квартиры явно не хранится.
    //Нумерация квартир в доме сквозная и начинается с нуля.

    //Конструктор может принимать количество этажей и массив количества квартир по этажам.

    public Dwelling(int quantityFloor, int quantityFlats){
        this.dwellingFloors=new DwellingFloor[quantityFloor];
    }

    /**
     * Конструктор может принимать массив этажей дома.
     */
    public Dwelling(DwellingFloor[] dwellingFloors){
        this.dwellingFloors=dwellingFloors;
    }

    /**
     * Создайте метод получения общего количества этажей дома.
     */
    public int getQuantFloors(){
        return dwellingFloors.length;
    }

    /**
     *Создайте метод получения общего количества квартир дома
     */
    public int getQuantFlats(){
        int Quant=0;
        for(int i=0; i<dwellingFloors.length;i++)
        {
            Quant+=dwellingFloors[i].getQuantityFlatsInFloor();
        }
        return Quant;
    }

    /**
     * Создайте метод получения общей площади квартир дома.
     */
    public int getAllSumSpace(){
        int Sum=0;
        for(int i=1; i<dwellingFloors.length; i++){
            Sum+=dwellingFloors[i].getSumSpace();
        }
        return Sum;
    }
    //Создайте метод получения общего количества комнат дома.

    public int getAllSumRoom(){
        int Sum=0;
        for(int i=1; i<dwellingFloors.length; i++){
            Sum+=dwellingFloors[i].getSumRooms();
        }
        return Sum;
    }
    /**
     * Создайте метод получения массива этажей жилого дома.
     */
    public DwellingFloor[] getArrFloors(){
        return dwellingFloors;
    }
    /**
     * Создайте метод получения объекта этажа, по его номеру в доме.
     */
    public DwellingFloor getDwellingFloor(int count){
    return dwellingFloors[count];
    }
    /**
     * Создайте метод изменения этажа по его номеру в доме и ссылке на обновленный этаж.
     */
    public void setChangeDwellingFloor(int num, DwellingFloor dwellingFloor){
        this.dwellingFloors[num]=dwellingFloor;
    }
    /**
     * Создайте метод получения объекта квартиры по ее номеру в доме.
     */
    public Flat getNumFlat(int num){
        return dwellingFloor.getNumFlats(num);
    }
    //Создайте метод изменения объекта квартиры по ее номеру в доме и ссылке на объект квартиры.
    public void setFlats(int num, Flat flat ){
        this.flats[num]=flat;
    }
    //Создайте метод добавления квартиры в дом по будущему номеру квартиры в доме (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на объект квартиры (количество этажей в доме при этом не увеличивается).
    public void setAddFlats(int num, Flat flat){
        Flat[] NewFlats=new Flat [flats.length+1];
        for(int i=0; i<flats.length; i++){
            NewFlats[i]=flats[i];
        }
        this.flats=NewFlats;
        this.flats[num]=flat;
    }
    //Создайте метод удаления квартиры по ее номеру в доме.
    public void setDelFlat(int num, Flat[] flats ){
        this.flats[num]=null;
    }
    //Создайте метод getBestSpace() получения самой большой по площади квартиры дома.
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
    //Создайте метод получения отсортированного по убыванию площадей массива квартир.
    public Flat[] getSortUpSpace(Flat flat) {
        for (int a = 0; a < flats.length-1; a++) {
            if (flats[a].getSpace()<flats[a+1].getSpace()){
                flat=flats[a];
                this.flats[a]=flats[a+1];
                this.flats[a+1]=flat;
            }
        }
        return flats;
    }

}