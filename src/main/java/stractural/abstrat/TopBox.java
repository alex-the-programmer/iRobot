package stractural.abstrat;

import stractural.abstrat.arms.Arm;
import stractural.abstrat.common.Part;

public interface TopBox extends Part {
    CameraBox getCameraBox ();
    Arm getLeftArm ();
    Arm getRightArm ();
}
