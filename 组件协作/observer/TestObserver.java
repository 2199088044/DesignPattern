package cn.dada.组件协作.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();

        subject1.attach(observerA);
        subject1.attach(observerB);

        subject2.attach(observerA);
        subject2.attach(observerB);
        subject2.detach(observerA);

        subject1.notifyObservers();
        System.out.println();
        subject2.notifyObservers();
    }
}
