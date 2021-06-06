package cn.dada.对象创建.abstract_factory;

import cn.dada.对象创建.abstract_factory.factory.IDBFactory;
import cn.dada.对象创建.abstract_factory.factory.MysqlDBFactory;
import cn.dada.对象创建.abstract_factory.factory.OracleDBFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        IDBFactory mysqlDBFactory = new MysqlDBFactory();
        IDBFactory oracleFactory = new OracleDBFactory();

        DBConnect connect = new DBConnect(mysqlDBFactory);
        connect.getConnection().doConnect();
        connect.getCommand().doCommand();

        connect = new DBConnect(oracleFactory);
        connect.getConnection().doConnect();
        connect.getCommand().doCommand();
    }
}
