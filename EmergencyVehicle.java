package model;

public class EmergencyVehicle extends Vehicle {

    public EmergencyVehicle(Road road, double speed, Direction direction) {
        // Chama o construtor flexível do Vehicle
        super(road, speed, direction);

        // Veículos de emergência são mais rápidos
        this.targetSpeed = speed * 1.5;
        this.acceleration = 200.0;
    }
}