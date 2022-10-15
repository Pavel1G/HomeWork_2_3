package transport;

import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private Transport[] transports;

    /**
     * Урок 2.5. Коллекции
     */

    private Driver driver;
    private Sponsor sponsor;

    private Mechanic mechanic;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    /**
     * Урок 2.7. Коллекции
     */
    public Transport(String brand, String model, double engineVolume, Driver driver, Sponsor sponsor, Mechanic mechanic) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
        setSponsor(sponsor);
        setMechanic(mechanic);
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
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
