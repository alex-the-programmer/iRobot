package stractural.abstrat.arms;

import javafx.geometry.Point3D;
import lombok.AllArgsConstructor;
import stractural.abstrat.common.Bearing;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.Pipe;

@AllArgsConstructor
public abstract class Arm extends Part {
    private Bearing shoulderBearing ;
    private Pipe shoulderPipe ;
    private Bearing elbowBearing ;
    private Pipe wristPipe ;
    private Bearing wristBearing ;
    // todo add grabbers
}
