package cn.dada.对象创建.builder.Item.burger;


import cn.dada.对象创建.builder.Item.Item;
import cn.dada.对象创建.builder.packing.Packing;
import cn.dada.对象创建.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
