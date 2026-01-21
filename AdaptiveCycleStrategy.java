package controller;

public class AdaptiveCycleStrategy implements Strategy {

    @Override
    public double greenDuration(int waitingCars) {
        return 3.0 + waitingCars;
    }
}

