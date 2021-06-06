package cn.dada.对象创建.abstract_factory.command;

public class MysqlCommand implements IDBCommand {
    @Override
    public void doCommand() {
        System.out.println("[MysqlCommand] executing mysql command...");
    }
}
