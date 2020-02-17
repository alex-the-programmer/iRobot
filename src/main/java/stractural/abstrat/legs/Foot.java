package stractural.abstrat.legs;

import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.Part;

public interface Foot extends Part {
    FootSection getRearFootSection();
    Expandable getExpander();
    FootSection getFrontFootSection();
}
