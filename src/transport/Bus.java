package transport;

public class Bus extends Transport implements Competing {

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

    @Override
    public void doPitStop() {
        System.out.printf("Автобус %s %s останавливается на пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void timeBestLap() {
        System.out.println("Лучшее время круга - 3 минуты 23 секунды.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 145 км/ч.");
    }
}
