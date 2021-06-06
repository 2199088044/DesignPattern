package cn.dada.对象创建.abstract_factory;

import cn.dada.对象创建.abstract_factory.command.IDBCommand;
import cn.dada.对象创建.abstract_factory.connection.IDBConnection;
import cn.dada.对象创建.abstract_factory.factory.IDBFactory;

public class DBConnect {
    private final IDBConnection connection;
    private final IDBCommand command;

    public DBConnect(IDBFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
    }

    public IDBConnection getConnection() {
        return connection;
    }

    public IDBCommand getCommand() {
        return command;
    }
}
