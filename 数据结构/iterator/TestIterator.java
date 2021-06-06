package cn.dada.数据结构.iterator;

public class TestIterator {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("衡水中学");
        ag.add("武汉大学");
        ag.add("上海交大");
        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + " ");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }
}