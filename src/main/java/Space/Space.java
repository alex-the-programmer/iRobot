package Space;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;

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

    public void addShape(Node shape){
        this.group.getChildren().add(shape);
    }
}
