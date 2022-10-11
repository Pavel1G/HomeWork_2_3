package transport;

public class Driver<T extends Transport & Competing> {
    private String name;
    private String driverLicense;
    private int experience;

    public Driver(String name, String driverLicense, int experience) {
        this.name = name;
        setDriverLicense(driverLicense);
        this.experience = experience;
    }

    public void infoAboutDriver(T transport) {
        System.out.printf("Водитель %s будет управлять автомобилем %s %s и будет участвовать в заезде. \n",
                getName(), transport.getBrand(), transport.getModel());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
