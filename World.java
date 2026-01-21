package model;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Vehicle> vehicles = new ArrayList<>();
    private boolean lightIsRed = false;
    private double timer = 0;

    public World() {
        // Criar apenas 2 ou 3 carros para começar simples
        vehicles.add(new Vehicle(10, 200, 50));
        vehicles.add(new Vehicle(100, 200, 40));
    }

    public List<Vehicle> getVehicles() { return vehicles; }

    public void tick(double deltaTime) {
        timer += deltaTime;
        if (timer > 5) { // Muda o sinal a cada 5 segundos
            lightIsRed = !lightIsRed;
            timer = 0;
        }

        for (Vehicle v : vehicles) {
            // Se o sinal está vermelho e o carro está a chegar ao meio (x=400)
            if (lightIsRed && v.getPositionX() > 350 && v.getPositionX() < 380) {
                v.setTargetSpeed(0.0);
            } else {
                v.setTargetSpeed(50.0);
            }
            v.update(deltaTime);
        }
    }

    public boolean isLightRed() { return lightIsRed; }
}