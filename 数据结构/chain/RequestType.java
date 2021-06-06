package cn.dada.数据结构.chain;

public enum RequestType {

    REQUEST_A("请求A"), REQUEST_B("请求B"), REQUEST_C("请求C"), REQUEST_D("请求D");

    private String desc;

    RequestType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
