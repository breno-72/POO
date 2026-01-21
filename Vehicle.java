package model;

public class Vehicle {
    private double x, y, speed, targetSpeed;
    private double waitingTime = 0;

    // Construtor simples para o teu World original
    public Vehicle(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.targetSpeed = speed;
    }

    // Métodos que o Sensor e Metrics precisam (os "símbolos" que faltavam)
    public double getPositionX() { return x; }
    public double getPositionY() { return y; }
    public double getWaitingTime() { return waitingTime; }
    public boolean isWaiting() { return speed < 0.1; }

    // Método que o World usa para parar o carro no semáforo
    public void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    public void update(double deltaTime) {
        // Se o alvo for 0, o carro abranda até parar
        if (speed > targetSpeed) speed -= 2;
        if (speed < targetSpeed) speed += 2;

        if (isWaiting()) {
            waitingTime += deltaTime;
        } else {
            x += speed * deltaTime;
            waitingTime = 0;
        }

        if (x > 800) x = 0; // Volta ao início
    }
}