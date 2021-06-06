package cn.dada.数据结构.iterator;

//抽象聚合
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
