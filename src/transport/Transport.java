package transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;


    /**
     * Урок 2.7. Коллекции
     */

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();

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

    public List<?> getDrivers() {
        return drivers;
    }

    public List<?> getSponsors() {
        return sponsors;
    }

    public List<?> getMechanics() {
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
