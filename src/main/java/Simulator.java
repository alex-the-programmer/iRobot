import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import lombok.val;
import stractural.abstrat.common.Bearing;
import stractural.simulationOnly.common.Expandable;
import stractural.simulationOnly.common.TransformableGroup;


public class Simulator extends Application {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;

    public static void main(String[] args) {
        launch(args);
    }

    private double anchorX, anchorY;
    private double anchorAngleX = 0;
    private double anchorAngleY = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);

    @Override
    public void start(Stage primaryStage) {
        val camera = new PerspectiveCamera(true);
        camera.setNearClip(1);
        camera.setFarClip(10000);

        val simulation = new TransformableGroup();
        camera.translateXProperty().set(0);
        camera.translateYProperty().set(0);
        camera.translateZProperty().set(-500);
        var expandable = new Expandable(
                100,
                0,
                100,
                new Bearing().getShape()
        );
        simulation.getChildren().add(expandable.getShape());

        val scene = new Scene(simulation, WIDTH, HEIGHT, true);

        scene.setFill(Color.SILVER);
        scene.setCamera(camera);

        primaryStage.setTitle("Simulation");
        primaryStage.setScene(scene);

        initMouseControl( simulation, scene, primaryStage);
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            switch (keyEvent.getCode()){
                case MINUS:
                    camera.translateZProperty().set(camera.getTranslateZ() + 10);
                    break;
                case PLUS:
                    camera.translateZProperty().set(camera.getTranslateZ() - 10);
                    break;
                case UP:
                    simulation.rotateByX(-10);
                    break;
                case DOWN:
                    simulation.rotateByX(10);
                    break;
                case LEFT:
                    simulation.rotateByZ(10);
                    break;
                case RIGHT:
                    simulation.rotateByZ(-10);
                    break;
            }
        });

        primaryStage.show();

//        System.out.println("Starting extension");
//        expandable.extendBy(80);
//        System.out.println("Finishing extension");
    }

    private void initMouseControl(TransformableGroup group, Scene scene, Stage stage) {
        Rotate xRotate, yRotate;
        group.getTransforms().addAll(
                xRotate = new Rotate(0, Rotate.X_AXIS),
                yRotate = new Rotate(0, Rotate.Y_AXIS)
        );

        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(mouseEvent -> {
            anchorX = mouseEvent.getSceneX();
            anchorY = mouseEvent.getSceneY();
            anchorAngleX = angleX.get();
            anchorAngleY = angleY.get();
        });

        scene.setOnMouseDragged(mouseEvent -> {
            angleX.set(anchorAngleX - (anchorY - mouseEvent.getSceneY()));
            angleY.set(anchorAngleY - (anchorX - mouseEvent.getSceneX()));
        });

        stage.addEventHandler(ScrollEvent.SCROLL, scrollEvent -> {
            double delta  = scrollEvent.getDeltaY();
            group.translateZProperty().set(group.getTranslateZ() + delta);
        });
    }
}
