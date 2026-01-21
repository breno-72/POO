package model;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    private int x, y; // Posição do cruzamento
    private List<Road> incomingRoads; // Estradas que chegam ao cruzamento
    private List<Road> outgoingRoads; // Estradas que saem do cruzamento

    public Intersection(int x, int y) {
        this.x = x;
        this.y = y;
        this.incomingRoads = new ArrayList<>();
        this.outgoingRoads = new ArrayList<>();
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void addIncomingRoad(Road road) {
        incomingRoads.add(road);
    }

    public void addOutgoingRoad(Road road) {
        outgoingRoads.add(road);
    }

    // Pode haver lógica aqui para gerir o tráfego no futuro
    // ...
}