package transport;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "TT", 2.0);
        Car bmw = new Car("BMW", "Z4", 2.4);
        Car renault = new Car("Renault", "Megane", 2.4);
        Car ford = new Car("Ford", "Mustang", 3.0);

        Truck kamaz = new Truck("Kamaz", "65806", 12.0);
        Truck maz = new Truck("MAZ", "6430", 11.1);
        Truck renaultTruck = new Truck("Renault", "Magnum", 12.8);
        Truck fordTruck = new Truck("Ford", "1286D", 6.8);

        Bus mazBus = new Bus("MAZ", "303", 7.7);
        Bus paz = new Bus("PAZ", "4234", 3.76);
        Bus liaz = new Bus("LIAZ", "6213", 6.65);
        Bus mercedes = new Bus("Mercedes", "Conecto", 10.7);
    }
}
