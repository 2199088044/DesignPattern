package cn.dada.对象创建.abstract_factory.factory;

import cn.dada.对象创建.abstract_factory.command.IDBCommand;
import cn.dada.对象创建.abstract_factory.command.OracleCommand;
import cn.dada.对象创建.abstract_factory.connection.IDBConnection;
import cn.dada.对象创建.abstract_factory.connection.OracleConnection;

public class OracleDBFactory implements IDBFactory {
    @Override
    public IDBConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public IDBCommand createCommand() {
        return new OracleCommand();
    }
}
