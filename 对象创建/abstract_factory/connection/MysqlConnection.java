package cn.dada.对象创建.abstract_factory.connection;

public class MysqlConnection implements IDBConnection {

    @Override
    public void doConnect() {
        System.out.println("[MysqlConnection] connecting mysql...");
    }
}
