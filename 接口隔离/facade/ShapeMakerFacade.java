package cn.dada.接口隔离.facade;

import cn.dada.接口隔离.facade.Interface.Shape;
import cn.dada.接口隔离.facade.impls.Circle;
import cn.dada.接口隔离.facade.impls.Rectangle;
import cn.dada.接口隔离.facade.impls.Square;

/**
 * @author Xiaohu Wang
 * @version 1.0
 * @date 2019/9/22 12:24
 */
public class ShapeMakerFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}