package cn.dada.对象创建.builder.Item;


import cn.dada.对象创建.builder.packing.Packing;

public interface Item {
    String name();

    Packing packing();

    float price();
}
