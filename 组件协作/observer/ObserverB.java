package cn.dada.组件协作.observer;

public class ObserverB implements Observer {
    @Override
    public void process() {
        System.out.println("[ObserverB] processing");
    }
}
