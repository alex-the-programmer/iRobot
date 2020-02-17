package stractural.abstrat.legs;

import stractural.abstrat.common.Bearing;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.Pipe;

public interface Leg extends Part {
    Bearing getTopBearing();
    stractural.abstrat.common.Pipe Pipe();
    Bearing BottomBearing();
    Foot Foot();
}
