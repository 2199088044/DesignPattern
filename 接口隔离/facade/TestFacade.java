package cn.dada.接口隔离.facade;

/**
 * @author Xiaohu Wang
 * @version 1.0
 * @date 2019/9/22 12:25
 */
public class TestFacade {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();

        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();
    }
}
