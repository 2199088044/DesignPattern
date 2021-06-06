package cn.dada.对象创建.builder.Item.cold_drink;


import cn.dada.对象创建.builder.Item.Item;
import cn.dada.对象创建.builder.packing.Bottle;
import cn.dada.对象创建.builder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}