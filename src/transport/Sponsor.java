package transport;

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

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }
}
