package cn.dada.数据结构.composite;

public class LeafNode extends TreeNode {

    public LeafNode(Integer value) {
        this.value = value;
    }

    @Override
    protected void printNodeValue() {
        System.out.println(this.value);
    }
}
