package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void beginMove() {
        System.out.println("Грузовой автомобиль начал движение.");
    }

    @Override
    void endMove() {
        System.out.println("Грузовой автомобиль закончил движение.");
    }
}
