public class Main {
    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House(1, 101, 75.5, 3, 3, "Ленина", "Апартаменты", 5);
        houses[1] = new House(2, 202, 90.0, 5, 4, "Писателя смирнова", "Квартира", 8);
        houses[2] = new House(3, 305, 120.0, 2, 5, "Дзержинскго", "Пентхаус", 10);


        int Rooms = 3;
        System.out.println("Квартиры с " + Rooms + " комнатами:");
        for (House house : houses) {
            if (house.getQuantity() == Rooms) {
                house.showInformation();
            }
        }

        int FloorMin = 2;
        int FloorMax = 5;
        System.out.println("Квартиры с " + Rooms + " комнатами на этаже от " + FloorMin + " до " + FloorMax + ":");
        for (House house : houses) {
            if (house.getQuantity() == Rooms && house.getFloor() >= FloorMin && house.getFloor() <= FloorMax) {
                house.showInformation();
            }
        }

        double desiredArea = 80.0;
        System.out.println("Квартиры с площадью более " + desiredArea + " кв.м.:");
        for (House house : houses) {
            if (house.getArea() > desiredArea) {
                house.showInformation();
            }
        }
    }
}