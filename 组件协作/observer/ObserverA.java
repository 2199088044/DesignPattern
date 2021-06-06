package cn.dada.组件协作.observer;

public class ObserverA implements Observer {
    @Override
    public void process() {
        System.out.println("[ObserverA] processing");
    }
}
