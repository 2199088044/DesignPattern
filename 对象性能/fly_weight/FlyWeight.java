package cn.dada.对象性能.fly_weight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlyWeight {
    private static Map<String, FlyWeightResource> pool = new HashMap<>();

    public static FlyWeightResource getObj(String key) {
        FlyWeightResource item = pool.get(key);
        if (Objects.nonNull(item)) {
            return item;
        }
        else {
            FlyWeightResource newItem = new FlyWeightResource(key);
            pool.put(key, newItem);
            return newItem;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            final int finalI = i;
            new Thread(() -> System.out.println("[A]threadLoop" + finalI + getObj(finalI + ""))).start();
        }

        for (int i = 0; i < 100; i++) {
            final int finalI = i;
            new Thread(() -> System.out.println("[B]threadLoop" + finalI + getObj(finalI + ""))).start();
        }
    }

    public static class FlyWeightResource {
        private String key;

        public FlyWeightResource(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
        // 不提供setKey方法
    }
}
