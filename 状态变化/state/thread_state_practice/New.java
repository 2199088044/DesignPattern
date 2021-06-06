package cn.dada.状态变化.state.thread_state_practice;

//具体状态类：新建状态
public class New extends ThreadState {
    public New() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    public void start(ThreadContext hj) {
        System.out.print("调用start()方法-->");
        if (stateName.equals("新建状态")) {
            hj.setState(new Runnable());
        }
        else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}