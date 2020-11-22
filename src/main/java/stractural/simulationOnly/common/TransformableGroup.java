package stractural.simulationOnly.common;

import javafx.scene.Group;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import lombok.val;

public class TransformableGroup extends Group {
    Transform transform = new Rotate();

    public void rotateByX(int angle){
        val rotate = new Rotate(angle, Rotate.X_AXIS);
        transform = transform.createConcatenation(rotate);
        this.getTransforms().clear();
        this.getTransforms().add(transform);
    }

    public void rotateByY(int angle){
        val rotate = new Rotate(angle, Rotate.Y_AXIS);
        transform = transform.createConcatenation(rotate);
        this.getTransforms().clear();
        this.getTransforms().add(transform);
    }

    public void rotateByZ(int angle){
        val rotate = new Rotate(angle, Rotate.Z_AXIS);
        transform = transform.createConcatenation(rotate);
        this.getTransforms().clear();
        this.getTransforms().add(transform);
    }
}
