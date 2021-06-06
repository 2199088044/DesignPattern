package cn.dada.对象创建.abstract_factory.factory;

import cn.dada.对象创建.abstract_factory.command.IDBCommand;
import cn.dada.对象创建.abstract_factory.connection.IDBConnection;

public interface IDBFactory {
    IDBConnection createConnection();

    IDBCommand createCommand();
}
