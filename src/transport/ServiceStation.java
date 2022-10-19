package transport;

import java.util.LinkedList;
import java.util.Queue;

/**
 * HomeWork_2_7
 * Урок с коллекциями
 */

public class ServiceStation {

    private String companyName;

    public ServiceStation(String companyName) {
        this.companyName = companyName;
    }

    private Queue transportsInQueue = new LinkedList();

    public void addCarToQueue(Car car) {
        transportsInQueue.add(car);
    }

    public void addTruckToQueue(Truck truck) {
        transportsInQueue.add(truck);
    }

    public void doService() {
        if (transportsInQueue.size() == 0) {
            System.out.println("Машин нет.");
        } else {
            Transport transport = (Transport) transportsInQueue.poll();
            if (transport != null) {
                System.out.printf("Проведено техобслуживание машины %s %s. \n",
                        transport.getBrand(), transport.getModel());
                doService();
            } else {
                System.out.println("Все машины обслужены.");
            }
        }
    }
}
