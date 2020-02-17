package stractural.abstrat.projections;

public interface Projectable<TProjection extends Projection> {
    TProjection getXProjection ();
    TProjection getYProjection ();
    TProjection getZProjection ();
}
