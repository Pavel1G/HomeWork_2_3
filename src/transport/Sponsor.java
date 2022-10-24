package transport;

import java.util.Objects;

/**
 * HomeWork_2_7
 * Урок с коллекциями
 */

public class Sponsor {

    private final String name;
    private int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        setSupportAmount(supportAmount);
    }

    public void getMoney() {
        System.out.printf("Спонсор %s выделяет %d рублей. \n",
                getName(), supportAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportAmount == sponsor.supportAmount && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportAmount);
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    @Override
    public String toString() {
        return name + ", сумма поддержки - " + supportAmount + " рублей";
    }
}
