package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import lombok.*;

import javax.management.ConstructorParameters;
import java.util.ArrayList;

@RequiredArgsConstructor
public abstract class Expandable extends Part {
    @Getter
    @NonNull
    protected int baseHeight;

    @Getter
    @NonNull
    protected int extendedHeight;

    @Getter
    @NonNull
    protected int maxExtension;

    @Getter
    @NonNull
    protected Node extendedObject;

    protected Cylinder cylinder;



    public Node getShape() {
        return new Group(cylinder, extendedObject);
    }

    public abstract void extendBy(int distance);

    public abstract void collapseBy(int distance);

    public abstract void setTo(int extendedLength);
}
