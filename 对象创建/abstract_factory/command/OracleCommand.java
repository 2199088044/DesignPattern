package cn.dada.对象创建.abstract_factory.command;

public class OracleCommand implements IDBCommand {
    @Override
    public void doCommand() {
        System.out.println("[OracleCommand] executing oracle command...");
    }
}
