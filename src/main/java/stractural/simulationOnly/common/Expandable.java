package stractural.simulationOnly.common;

import javafx.scene.Node;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.val;
import stractural.abstrat.common.MotionOverLimitException;

public class Expandable extends stractural.abstrat.common.Expandable {


    public Expandable(@NonNull int baseHeight, @NonNull int extendedHeight, @NonNull int maxExtension, @NonNull Node extendedObject) {
        super(baseHeight, extendedHeight, maxExtension, extendedObject);
        this.cylinder = new Cylinder(10, baseHeight + extendedHeight);
    }

    @SneakyThrows
    @Override
    public void extendBy(int distance) {
        val updatedHeight = extendedHeight + distance;
        if(updatedHeight> maxExtension) {
            throw new MotionOverLimitException();
        }

        simulateExtension(updatedHeight);

        extendedHeight = updatedHeight;
    }

    @SneakyThrows
    @Override
    public void collapseBy(int distance) {
        val updatedHeight = extendedHeight - distance;
        if(updatedHeight<0) {
            throw new MotionOverLimitException();
        }

        simulateCollapsing(updatedHeight);

        extendedHeight = updatedHeight;
    }

    @Override
    public void setTo(int extendedHeight) {
        if(extendedHeight > this.extendedHeight){
            extendBy(extendedHeight - this.extendedHeight);
        } else {
            collapseBy(this.extendedHeight - extendedHeight);
        }
    }

    private void simulateExtension(int updatedHeight){
        for (int i = extendedHeight+1; i <= updatedHeight; i++){
            cylinder.setHeight(cylinder.getHeight() + i);
            validate();
        }
    }

    private void simulateCollapsing(int updatedHeight){
        for (int i = extendedHeight+-1; i >= updatedHeight; i--){
            cylinder.setHeight(i);
            validate();
        }
    }

}
