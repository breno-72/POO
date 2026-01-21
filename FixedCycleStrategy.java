package controller;

public class FixedCycleStrategy implements Strategy {

    @Override
    public double greenDuration(int waitingCars) {
        return 6.0;
    }
}

