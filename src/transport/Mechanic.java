package transport;

import java.util.Objects;

/**
 * HomeWork_2_7
 * Урок с коллекциями
 */

public class Mechanic<T extends Transport> {

    private String name;
    private String doubleName;
    private String nameCompany;


    public Mechanic(String name, String doubleName, String nameCompany) {
        setName(name);
        setDoubleName(doubleName);
        setNameCompany(nameCompany);
    }

    public void makeService(T transport) {
        System.out.printf("Механик %s %s из компании %s обслуживает машину %s %s. \n",
                getName(), getDoubleName(), getNameCompany(),
                transport.getBrand(), transport.getModel());
    }

    public void repairTransport(T transport) {
        System.out.printf("Механик %s %s из компании %s чинит машину %s %s. \n",
                getName(), getDoubleName(), getNameCompany(),
                transport.getBrand(), transport.getModel());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(doubleName, mechanic.doubleName) && Objects.equals(nameCompany, mechanic.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, doubleName, nameCompany);
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

    @Override
    public String toString() {
        return name + ' ' + doubleName + " из  компании " + nameCompany;
    }
}
