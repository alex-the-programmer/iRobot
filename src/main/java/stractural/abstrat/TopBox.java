package stractural.abstrat;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import lombok.AllArgsConstructor;
import stractural.abstrat.arms.Arm;
import stractural.abstrat.common.Part;

@AllArgsConstructor
public class TopBox extends Part {
    private CameraBox cameraBox;
    private Arm leftArm;
    private Arm rightArm;


    public Node getShape() {
        return new Box(100, 100, 50);
    }
}
