package cn.dada.对象创建.abstract_factory.connection;

public class OracleConnection implements IDBConnection {

    @Override
    public void doConnect() {
        System.out.println("[OracleConnection] connecting mysql...");
    }
}
