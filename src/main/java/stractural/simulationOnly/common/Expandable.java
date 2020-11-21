package stractural.simulationOnly.common;

import javafx.scene.shape.Cylinder;
import lombok.SneakyThrows;
import lombok.val;
import stractural.abstrat.common.MotionOverLimitException;

public class Expandable extends stractural.abstrat.common.Expandable {


    public Expandable(int extendedHeight, int maxExtension) {
        super(extendedHeight, maxExtension);
    }

    @SneakyThrows
    @Override
    public void extendBy(int distance) {
        val updatedHeight = extendedHeight += distance;
        if(updatedHeight> extendedHeight) {
            throw new MotionOverLimitException();
        }

        simulateExtension(updatedHeight);

        extendedHeight = updatedHeight;
    }

    @SneakyThrows
    @Override
    public void collapseBy(int distance) {
        val updatedHeight = extendedHeight -= distance;
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
        val shape = (Cylinder) getShape();
        for (int i = extendedHeight+1; i <= updatedHeight; i++){
            shape.setHeight(i);
            validate();
        }
    }

    private void simulateCollapsing(int updatedHeight){
        val shape = (Cylinder) getShape();
        for (int i = extendedHeight+-1; i >= updatedHeight; i--){
            shape.setHeight(i);
            validate();
        }
    }

}
