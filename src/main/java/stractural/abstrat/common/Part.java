package stractural.abstrat.common;

import Space.Space;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import lombok.Getter;

public abstract class Part {
    @Getter
    private Node shape;

    public Part(Point3D initialPosition) {
        this.shape = setShape();
        Space.getInstance().addShape(this.shape, initialPosition);
    }

    protected abstract Node setShape();
}
