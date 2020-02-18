package stractural.abstrat;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.arms.Arm;
import stractural.abstrat.common.Part;

public class TopBox extends Part {
    private CameraBox cameraBox;
    private Arm leftArm;
    private Arm rightArm;

    TopBox(Point3D initialPosition, CameraBox cameraBox, Arm leftArm, Arm rightArm) {
        super(initialPosition);
        this.cameraBox = cameraBox;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    protected Shape3D setShape() {
        return new Box(100, 100, 50);
    }
}
