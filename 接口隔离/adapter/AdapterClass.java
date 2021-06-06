package cn.dada.接口隔离.adapter;

public class AdapterClass implements IAdapter{
    protected IAdaptee adaptee;

    public AdapterClass(IAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void process() {
        // etc...
        adaptee.bar(adaptee.foo());
    }
}
