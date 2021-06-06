package cn.dada.对象创建.builder;


import cn.dada.对象创建.builder.Item.burger.ChickenBurger;
import cn.dada.对象创建.builder.Item.burger.VegBurger;
import cn.dada.对象创建.builder.Item.cold_drink.Coke;
import cn.dada.对象创建.builder.Item.cold_drink.Pepsi;
import cn.dada.对象创建.builder.Meal;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}