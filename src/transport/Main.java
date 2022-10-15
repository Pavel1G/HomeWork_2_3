package transport;

import java.util.ArrayList;
import java.util.LinkedList;

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

        //Если я не указываю в <> конкретный класс класса Transport, то получается что ron может управлять
        // всеми классами-наследниками Transport?
        Driver ron = new Driver("Ron", "B", 10);
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
//        printInfo(mike, renault);
//
//        service(audi, bmw, renault, ford,
//                kamaz, maz, renaultTruck, fordTruck,
//                mazBus, paz, liaz, mercedes);
//    }
//
//    private static void printInfo(Driver<?> driver, Transport transport) {
//        System.out.printf("Водитель %s управляет автомобилем %s %s. \n", driver.getName(), transport.getBrand(), transport.getModel());
//        transport.checkType();
//    }
//
//    private static void service(Transport... transports) {
//        for (Transport transport : transports) {
//            serviceTransport(transport);
//        }
//    }
//
//    private static void serviceTransport(Transport transport) {
//        try {
//            if (!transport.checkDiagnosed()) {
//                System.out.printf("Автомобиль %s %s не прошел диагностику! \n", transport.getBrand(), transport.getModel());
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        /**
         * HomeWork_2_7
         * Урок с коллекциями
         */

        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(audi);
        transports.add(renaultTruck);
        transports.add(mazBus);

        LinkedList<Driver> drivers = new LinkedList<>();
        drivers.add(mike);
        drivers.add(bob);
        drivers.add(john);

        LinkedList<Sponsor> sponsors = new LinkedList<>();
        Sponsor gazprom = new Sponsor("Газпром", 1000);
        //А можно ли как-то указать, что спонсор lukoil может обслуживать и класс Car, и Truck?
        Sponsor lukoil = new Sponsor("Лукойл", 50);
        Sponsor lukoilTruck = new Sponsor("Лукойл-Трак", 100);
        sponsors.add(gazprom);
        sponsors.add(lukoil);
        sponsors.add(lukoilTruck);

        LinkedList<Mechanic> mechanics = new LinkedList<>();
        Mechanic johnMechanic = new Mechanic("John", "Smith", "Aurora");
        Mechanic robMechanic = new Mechanic("Rob", "Wesley", "Beta");
        Mechanic alice = new Mechanic("Alice", "Shiny", "Beta");
        mechanics.add(johnMechanic);
        mechanics.add(robMechanic);
        mechanics.add(alice);

        Car audiTT = new Car("Audi", "TT", 2.5, mike, gazprom, alice, Car.TypeBody.HATCHBACK);
        System.out.printf("У машины %s %s водитель - %s. Спонсор - %s. Механик - %s. \n",
                audiTT.getBrand(), audiTT.getModel(), audiTT.getDriver().getName(), audiTT.getSponsor().getName(),
                audiTT.getMechanic().getName());
    }

}


//    public static void autoracing() {
//    }
//}