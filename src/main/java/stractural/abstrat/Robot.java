package stractural.abstrat;

import stractural.abstrat.arms.Arm;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.Part;
import stractural.abstrat.legs.Leg;

public interface Robot<TPart extends Part> extends Part {
   TopBox getTopBox ();
   Expandable getLeftTopBoxExpander ();
   Expandable getRightTopBoxExpander ();
   Leg getLeftLeg ();
   Leg getRightLeg ();
}
