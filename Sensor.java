package model;

import java.util.List;

public class Sensor {

    // Este é o método que faltava e causava o erro
    public int countWaitingCars(List<Vehicle> vehicles) {
        if (vehicles == null) return 0;
        int count = 0;
        for (Vehicle v : vehicles) {
            if (v.isWaiting()) {
                count++;
            }
        }
        return count;
    }

    public void detect(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            if (v.isWaiting()) {
                System.out.println("Veículo parado detectado!");
            }
        }
    }
}