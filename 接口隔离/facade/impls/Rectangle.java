package cn.dada.接口隔离.facade.impls;


import cn.dada.接口隔离.facade.Interface.Shape;

/**
 * @author Xiaohu Wang
 * @version 1.0
 * @date 2019/9/22 12:23
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
