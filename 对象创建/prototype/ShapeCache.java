package cn.dada.对象创建.prototype;

import cn.dada.对象创建.prototype.shapes.Circle;
import cn.dada.对象创建.prototype.shapes.Rectangle;
import cn.dada.对象创建.prototype.shapes.Shape;
import cn.dada.对象创建.prototype.shapes.Square;

import java.util.Hashtable;

//使用static关键字加载资源
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
