package stractural.abstrat.arms;

import javafx.geometry.Point3D;
import stractural.abstrat.common.Bearing;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.Pipe;

// potentially convert to an abstract class
public abstract class Arm extends Part {
    private Bearing shoulderBearing ;
    private Pipe shoulderPipe ;
    private Bearing elbowBearing ;
    private Pipe wristPipe ;
    private Bearing wristBearing ;

    public Arm(Point3D initialPosition) {
        super(initialPosition);
    }
    // todo add grabbers
}
