package stractural.abstrat.common;

import Space.Space;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import lombok.Getter;
import lombok.SneakyThrows;

public abstract class Part {
    private final int MOTION_DELAY_UNIT = 200;

    @Getter
    private Node shape;

    public Part() {
        this.shape = setShape();
    }

    protected abstract Node setShape();

    // this method should also validate for collision of any objects within the system (with other parts of the robot or external objects on the scene) and raise an error
    @SneakyThrows
    protected void validate(){
        Thread.sleep(MOTION_DELAY_UNIT);
    }
}
