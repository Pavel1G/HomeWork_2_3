package transport;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void beginMove() {
        System.out.println("Легковой автомобиль начал движение.");
    }

    @Override
    void endMove() {
        System.out.println("Легковой автомобиль закончил движение.");
    }

    @Override
    public void doPitStop() {
        System.out.printf("Машина %s %s останавливается на пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void timeBestLap() {
        System.out.println("Лучшее время круга - 1 минута 22 секунды.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 250 км/ч.");
    }
}
