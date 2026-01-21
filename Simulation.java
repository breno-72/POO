package controller;

import model.World;

public class Simulation {
    private World world;
    private SimulationState state;

    public Simulation(World world) {
        this.world = world;
        this.state = SimulationState.STOPPED;
    }

    public void start() {
        this.state = SimulationState.RUNNING;
    }

    public void stop() {
        this.state = SimulationState.STOPPED;
    }

    public void pause() {
        this.state = SimulationState.PAUSED;
    }

    public void update(double deltaTime) {
        if (state != SimulationState.RUNNING) return;

        // ISTO É MUITO IMPORTANTE: faz o mundo avançar no tempo
        world.tick(deltaTime);
    }
}

// Enum SimulationState
enum SimulationState {
    RUNNING, STOPPED, PAUSED
}
