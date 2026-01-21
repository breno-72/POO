package view;

import controller.Simulation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.World;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        World world = new World();
        Simulation simulation = new Simulation(world);

        CanvasView canvasView = new CanvasView();
        canvasView.setWorld(world);
        ControlPanel controlPanel = new ControlPanel(canvasView, simulation);

        BorderPane root = new BorderPane();
        root.setCenter(canvasView);
        root.setBottom(controlPanel);

        new AnimationTimer() {
            private long lastUpdate = 0;
            @Override
            public void handle(long now) {
                if (lastUpdate == 0) { lastUpdate = now; return; }
                double deltaTime = (now - lastUpdate) / 1_000_000_000.0;
                lastUpdate = now;

                simulation.update(deltaTime);
                canvasView.draw(); // Redesenha a cada frame
            }
        }.start();

        stage.setTitle("Smart Traffic Simulation - Final");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}