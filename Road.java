package model;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private int startX, startY, endX, endY;
    private int width; // Largura da estrada
    private List<Vehicle> vehiclesOnRoad; // Que veículos estão nesta estrada

    public Road(int startX, int startY, int endX, int endY, int width) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.width = width;
        this.vehiclesOnRoad = new ArrayList<>();
    }

    // --- Getters ---
    public int getStartX() { return startX; }
    public int getStartY() { return startY; }
    public int getEndX() { return endX; }
    public int getEndY() { return endY; }
    public int getWidth() { return width; }
    public List<Vehicle> getVehiclesOnRoad() { return vehiclesOnRoad; }

    // --- Métodos para adicionar/remover veículos ---
    public void addVehicle(Vehicle v) {
        vehiclesOnRoad.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehiclesOnRoad.remove(v);
    }
}