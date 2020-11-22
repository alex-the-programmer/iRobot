import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import lombok.val;
import stractural.abstrat.common.Bearing;
import stractural.simulationOnly.common.Expandable;

public class Simulator extends Application {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        val camera = new PerspectiveCamera();
        val scene = new Scene(getGroup(), WIDTH, HEIGHT);
        scene.setFill(Color.SILVER);

        primaryStage.setTitle("Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent getGroup() {
        val testGroup = new Group();
        testGroup.translateXProperty().set(WIDTH/2);
        testGroup.translateYProperty().set(HEIGHT/2);
        testGroup.getChildren().add(new Expandable(
                100,
                100,
                50,
                new Bearing().getShape()
        ).getShape());
        return testGroup;
    }
}
