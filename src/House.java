public class House {
    private int id;
    private int Number; 
    private double area;
    private int floor;
    private int Quantity;
    private String street;
    private String Type;
    private int Term;

    public House(int id, int Number, double area, int floor, int Quantity, String street, String Type, int Term) {
        this.id = id;
        this.Number = Number;
        this.area = area;
        this.floor = floor;
        this.Quantity = Quantity;
        this.street = street;
        this.Type = Type;
        this.Term = Term;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int Number) {
        this.Number = Number;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public int getTerm() {
        return Term;
    }
    public void setTerm(int Term) {
        this.Term = Term;
    }
    public void showInformation() {
        System.out.println("ID: " + id);
        System.out.println("Номер квартиры: " + Number);
        System.out.println("Площадь: " + area + " кв м");
        System.out.println("Этаж: " + floor);
        System.out.println("Количество комнат: " + Quantity);
        System.out.println("Улица: " + street);
        System.out.println("Тип: " + Type);
        System.out.println("Срок эксплуатации: " + Term);
    }
}