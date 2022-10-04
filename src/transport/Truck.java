package transport;

public class Truck extends Transport implements Competing {

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

    @Override
    public void doPitStop() {
        System.out.printf("Машина %s %s останавливается на пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void timeBestLap() {
        System.out.println("Лучшее время круга - 2 минуты 5 секунд.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 175 км/ч.");
    }
}
