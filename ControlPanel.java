package view;

import controller.Simulation;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class ControlPanel extends HBox {
    public ControlPanel(CanvasView canvasView, Simulation simulation) {
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-padding: 10; -fx-background-color: #444;");

        Button btnStart = new Button("Iniciar Simulação");
        btnStart.setOnAction(e -> {
            simulation.start();
            System.out.println("Simulação Ativa!");
        });

        Button btnStop = new Button("Parar");
        btnStop.setOnAction(e -> simulation.stop());

        this.getChildren().addAll(btnStart, btnStop);
    }
}