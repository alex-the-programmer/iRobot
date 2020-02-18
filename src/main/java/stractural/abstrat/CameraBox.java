package stractural.abstrat;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.common.Part;

public class CameraBox extends Part {
    protected Node setShape() {
        return new Box(20, 20, 10);
    }
}
