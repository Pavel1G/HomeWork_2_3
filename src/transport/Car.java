package transport;

import java.util.List;

public class Car extends Transport implements Competing {

    public enum TypeBody {
        SEDAN("Седан"), HATCHBACK("Хэтчбек"), COUPE("Купе"), STATION_WAGON("Универсал"),
        SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        private String typeBody;

        TypeBody(String typeBody) {
            this.typeBody = typeBody;
        }

        public String getTypeBody() {
            return typeBody;
        }
    }

    private TypeBody typeBody;

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
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
    void checkType() {
        if (typeBody == null) {
            System.out.println("Данные неизвестны.");
        } else {
            System.out.println("Тип машины - " + typeBody.name());
        }
    }

    @Override
    boolean checkDiagnosed() {
        return Math.random() > 0.5;
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
