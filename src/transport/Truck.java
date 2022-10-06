package transport;

public class Truck extends Transport implements Competing {

    private TypeLoad typeLoad;

    public enum TypeLoad {
        N1(0D, 3.5), N2(3.5, 12D), N3(12D, null);


        private final Double from;
        private final Double to;

        TypeLoad(Double from, Double to) {
            this.from = from;
            this.to = to;
        }


        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    }

    public Truck(String brand, String model, double engineVolume, TypeLoad typeLoad) {
        super(brand, model, engineVolume);
        this.typeLoad = typeLoad;
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
    void checkType() {
        if (typeLoad == null) {
            System.out.println("Данные неизвестны.");
        } else {
            System.out.println("Грузоподъемность машины от " + typeLoad.getFrom() + " до " + typeLoad.getTo());
        }
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
