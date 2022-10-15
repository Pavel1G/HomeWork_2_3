package transport;

/**
 * HomeWork_2_7
 * Урок с коллекциями
 */

public class Mechanic {

    private String name;
    private String doubleName;
    private String nameCompany;


    public Mechanic(String name, String doubleName, String nameCompany) {
        setName(name);
        setDoubleName(doubleName);
        setNameCompany(nameCompany);
    }

    public void makeService() {
        System.out.printf("Механик %s %s из компании %s обслуживает машину. \n",
                getName(), getDoubleName(), getNameCompany());
    }

    public void repairTransport() {
        System.out.printf("Механик %s %s из компании %s чинит машину. \n",
                getName(), getDoubleName(), getNameCompany());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoubleName() {
        return doubleName;
    }

    public void setDoubleName(String doubleName) {
        this.doubleName = doubleName;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}
