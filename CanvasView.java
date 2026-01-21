package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.*;

public class CanvasView extends Canvas {
    private World world;

    public CanvasView() { setWidth(800); setHeight(400); }
    public void setWorld(World world) { this.world = world; }

    public void draw() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.LIGHTGRAY); // Fundo simples
        gc.fillRect(0, 0, 800, 400);

        if (world != null) {
            // Desenha o sinal
            gc.setFill(world.isLightRed() ? Color.RED : Color.GREEN);
            gc.fillOval(400, 50, 30, 30);

            // Desenha os carros
            gc.setFill(Color.BLUE);
            for (Vehicle v : world.getVehicles()) {
                gc.fillRect(v.getPositionX(), v.getPositionY(), 30, 15);
            }
        }
    }
}