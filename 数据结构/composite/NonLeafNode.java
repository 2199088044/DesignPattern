package cn.dada.数据结构.composite;

import java.util.List;

public class NonLeafNode extends TreeNode {

    private final List<TreeNode> kids;

    public NonLeafNode(Integer value, List<TreeNode> kids) {
        this.value = value;
        this.kids = kids;
    }

    @Override
    protected void printNodeValue() {
        // 先序遍历
        System.out.println(this.value);
        for (TreeNode kid : kids) {
            // 多态递归调用，kid可能是NonLeafNode，也可能是LeafNode
            // 若是非叶子节点，则递归调用，若是叶子节点，输出叶子节点的值后开始回溯
            kid.printNodeValue();
        }
        // 后序遍历
        // System.out.println(this.value);
    }
}
