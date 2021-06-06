package cn.dada.对象创建.abstract_factory.factory;

import cn.dada.对象创建.abstract_factory.command.IDBCommand;
import cn.dada.对象创建.abstract_factory.command.MysqlCommand;
import cn.dada.对象创建.abstract_factory.connection.IDBConnection;
import cn.dada.对象创建.abstract_factory.connection.MysqlConnection;

public class MysqlDBFactory implements IDBFactory {
    @Override
    public IDBConnection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public IDBCommand createCommand() {
        return new MysqlCommand();
    }
}
