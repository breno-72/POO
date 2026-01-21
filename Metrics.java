package util;

import model.Vehicle;
import java.util.List;

public class Metrics {
    public static double averageWaitingTime(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) return 0;

        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.getWaitingTime(); // Agora o método será encontrado!
        }
        return total / vehicles.size();
    }
}