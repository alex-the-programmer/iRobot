package stractural.abstrat.common;

public interface Expandable extends Part {
    void extendBy(int distance);

    void collapseBy(int distance);

    void setTo(int extendedLength);
}
