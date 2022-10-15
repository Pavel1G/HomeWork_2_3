package transport;

import java.util.LinkedList;
import java.util.Queue;

/**
 * HomeWork_2_7
 * Урок с коллекциями
 */

public class ServiceStation<T extends Car, Truck> {

    private String companyName;

    private Queue<T> queue = new LinkedList<T>();

    public void addAutoToQueue(T auto) {
        queue.add(auto);
    }

    public void doService() {
        T auto = queue.poll();
        if (auto != null) {
            System.out.printf("Проведено техобслуживание машины %s %s. \n",
                    auto.getBrand(), auto.getModel());
        }
    }
}
