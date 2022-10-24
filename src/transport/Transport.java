package transport;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;


    /**
     * Урок 2.7. Коллекции
     * Урок 2.8. Замена коллекции с List на Set
     */

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    private final Set<Mechanic<?>> mechanics = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    /**
     * Урок 2.7. Коллекции
     */
    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public Set<?> getDrivers() {
        return drivers;
    }

    public Set<?> getSponsors() {
        return sponsors;
    }

    public Set<?> getMechanics() {
        return mechanics;
    }

    /**
     * Конец
     */

    abstract void beginMove();

    abstract void endMove();

    abstract void checkType();

    abstract boolean checkDiagnosed();

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6d;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
