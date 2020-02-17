package stractural.abstrat.arms;

import stractural.abstrat.common.Bearing;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.Pipe;

// potentially convert to an abstract class
public interface Arm extends Part {
    Bearing getShoulderBearing ();
    Pipe getShoulderPipe ();
    Bearing getElbowBearing ();
    Pipe getWristPipe ();
    Bearing getWristBearing ();
    // todo add grabbers
}
