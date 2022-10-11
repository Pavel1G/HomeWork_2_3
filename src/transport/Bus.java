package transport;

public class Bus extends Transport implements Competing {

    private TypeCapacity typeCapacity;

    public enum TypeCapacity {
        VERY_SMALL(0D, 10D), SMALL(10D, 25D), MEDIUM(25D, 50D),
        BIG(50D, 80D), VERY_BIG(80D, 120D);

        private final Double from;
        private final Double to;

        TypeCapacity(Double from, Double to) {
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


    public Bus(String brand, String model, double engineVolume, TypeCapacity typeCapacity) {
        super(brand, model, engineVolume);
        this.typeCapacity = typeCapacity;
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
    void checkType() {
        if (typeCapacity == null) {
            System.out.println("Данные неизвестны.");
        } else {
            System.out.println("Пассажировместимость машины от " + typeCapacity.getFrom() + " до " + typeCapacity.getTo());
        }
    }

    @Override
    boolean checkDiagnosed() {
        System.out.printf("Автобус %s %s в диагностике не нуждается. \n", getBrand(), getModel());
        return true;
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
