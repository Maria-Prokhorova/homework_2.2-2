public class Main {
    public static void main(String[] args) {

        Transport[] transport = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 3)

        };

        ServiceStation station = new ServiceStation();
        for (Transport value : transport) {
            System.out.println(value);
            station.check(value);
            System.out.println();
        }
    }
}