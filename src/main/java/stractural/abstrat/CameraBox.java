package stractural.abstrat;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.common.Part;

public class CameraBox extends Part {
    public CameraBox(Point3D initialPosition) {
        super(initialPosition);
    }

    protected Shape3D setShape() {
        return new Box(20, 20, 10);
    }
}
