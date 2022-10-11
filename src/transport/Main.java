package transport;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "TT", 2.0, Car.TypeBody.SEDAN);
        Car bmw = new Car("BMW", "Z4", 2.4, Car.TypeBody.HATCHBACK);
        Car renault = new Car("Renault", "Megane", 2.4, Car.TypeBody.HATCHBACK);
        Car ford = new Car("Ford", "Mustang", 3.0, Car.TypeBody.SEDAN);

        Driver<Car> mike = new Driver<>("Mike", "B", 10);
        mike.infoAboutDriver(audi);

        Car[] cars = {audi, bmw, renault, ford};
        for (Car car : cars) {
            car.doPitStop();
            car.timeBestLap();
            car.maxSpeed();
            System.out.println("---------------------------------------------");
        }
        System.out.println();
        System.out.println();


        Truck kamaz = new Truck("Kamaz", "65806", 12.0, Truck.TypeLoad.N2);
        Truck maz = new Truck("MAZ", "6430", 11.1, Truck.TypeLoad.N3);
        Truck renaultTruck = new Truck("Renault", "Magnum", 12.8, Truck.TypeLoad.N2);
        Truck fordTruck = new Truck("Ford", "1286D", 6.8, Truck.TypeLoad.N1);

        Driver<Truck> bob = new Driver<>("Bob", "C", 15);
        bob.infoAboutDriver(renaultTruck);
//        bob.infoAboutDriver(renault);

        Truck[] trucks = {kamaz, maz, renaultTruck, fordTruck};
        for (Truck truck : trucks) {
            truck.doPitStop();
            truck.timeBestLap();
            truck.maxSpeed();
            System.out.println("---------------------------------------------");
        }
        System.out.println();
        System.out.println();

        Bus mazBus = new Bus("MAZ", "303", 7.7, Bus.TypeCapacity.BIG);
        Bus paz = new Bus("PAZ", "4234", 3.76, Bus.TypeCapacity.VERY_SMALL);
        Bus liaz = new Bus("LIAZ", "6213", 6.65, Bus.TypeCapacity.MEDIUM);
        Bus mercedes = new Bus("Mercedes", "Conecto", 10.7, Bus.TypeCapacity.VERY_SMALL);

        Driver<Bus> john = new Driver<>("John", "D", 30);
        john.infoAboutDriver(mercedes);

        Bus[] buses = {mazBus, paz, liaz, mercedes};
        for (Bus bus : buses) {
            bus.doPitStop();
            bus.timeBestLap();
            bus.maxSpeed();
            System.out.println("---------------------------------------------");
        }
        System.out.println();
        printInfo(mike, renault);

        service(audi, bmw, renault, ford,
                kamaz, maz, renaultTruck, fordTruck,
                mazBus, paz, liaz, mercedes);
    }

    private static void printInfo(Driver<?> driver, Transport transport) {
        System.out.printf("Водитель %s управляет автомобилем %s %s. \n", driver.getName(), transport.getBrand(), transport.getModel());
        transport.checkType();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.checkDiagnosed()) {
                System.out.printf("Автомобиль %s %s не прошел диагностику! \n", transport.getBrand(), transport.getModel());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
