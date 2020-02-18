package Space;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Shape3D;

public class Space {
    private static Space space;
    private Group group = new Group();
    private Scene scene = new Scene(group, 10000, 10000);
    private Space(){}

    public static Space getInstance (){
        if(space == null){
            space = new Space();
        }

        return space;
    }

    public void addShape(Shape3D shape, Point3D initialPosition){
        this.group.getChildren().add(shape);
        shape.translateXProperty().set(initialPosition.getX());
        shape.translateYProperty().set(initialPosition.getY());
        shape.translateZProperty().set(initialPosition.getZ());
    }
}
