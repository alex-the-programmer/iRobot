package stractural.abstrat.common;

import Space.Space;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import lombok.Getter;

public abstract class Part {
    @Getter
    private Node shape;

    public Part() {
        this.shape = setShape();
    }

    protected abstract Node setShape();
}
