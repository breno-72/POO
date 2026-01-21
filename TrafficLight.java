package model;

import model.state.TrafficLightState;
import model.state.GreenState;

public class TrafficLight {
    private TrafficLightState state;
    // Remova ou comente lógicas de timer simples se elas estiverem aqui

    public TrafficLight() {
        // Inicia com o estado Verde (ou o que preferir)
        this.state = new GreenState(this);
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public TrafficLightState getState() {
        return state;
    }

    // ESTE É O MÉTODO QUE FALTAVA (O "SÍMBOLO" DO ERRO)
    public Object getStrategy() {
        // Retorne o objeto de estratégia que o seu GreenState espera.
        // Se não tiver uma classe de estratégia, retorne 'this' ou null apenas para compilar.
        return null;
    }

    public void update(double deltaTime) {
        if (state != null) {
            state.update(deltaTime);
        }
    }

    // Método para o CanvasView saber que cor desenhar
    public String getColorName() {
        if (state instanceof GreenState) return "GREEN";
        return "RED";
    }
}