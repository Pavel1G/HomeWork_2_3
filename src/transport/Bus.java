package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void beginMove() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    void endMove() {
        System.out.println("Автобус закончил движение.");
    }
}
