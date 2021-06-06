package cn.dada.接口隔离.facade.impls;


import cn.dada.接口隔离.facade.Interface.Shape;

/**
 * @author Xiaohu Wang
 * @version 1.0
 * @date 2019/9/22 12:24
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
