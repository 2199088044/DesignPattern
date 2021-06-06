package cn.dada.单一职责.bridge;

import cn.dada.单一职责.bridge.变化方向1.MobileMessager;
import cn.dada.单一职责.bridge.变化方向1.PCMessager;
import cn.dada.单一职责.bridge.变化方向2.LiteMessagerImpl;
import cn.dada.单一职责.bridge.变化方向2.PerfectMessagerImpl;

public class TestBridge {
    public static void main(String[] args) {
        LiteMessagerImpl liteMessagerImpl = new LiteMessagerImpl();
        PerfectMessagerImpl perfectMessagerImpl = new PerfectMessagerImpl();

        // mobile设备相关操作
        // 1. lite version
        System.out.println("mobile lite version----------");
        MobileMessager mobileMessager = new MobileMessager(liteMessagerImpl);
        mobileMessager.login();
        mobileMessager.playSound();
        mobileMessager.writeText();
        mobileMessager.logoff();
        // 2. perfect version
        System.out.println("mobile perfect version----------");
        mobileMessager = new MobileMessager(perfectMessagerImpl);
        mobileMessager.login();
        mobileMessager.playSound();
        mobileMessager.writeText();
        mobileMessager.logoff();

        // pc设备相关操作
        // 1. lite version
        System.out.println("pc lite version----------");
        PCMessager pcMessager = new PCMessager(liteMessagerImpl);
        pcMessager.login();
        pcMessager.playSound();
        pcMessager.writeText();
        pcMessager.logoff();
        // 2. perfect version
        System.out.println("pc perfect version----------");
        pcMessager = new PCMessager(perfectMessagerImpl);
        pcMessager.login();
        pcMessager.playSound();
        pcMessager.writeText();
        pcMessager.logoff();
    }
}
