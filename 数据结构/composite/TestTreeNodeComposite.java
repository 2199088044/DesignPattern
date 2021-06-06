package cn.dada.数据结构.composite;

import java.util.ArrayList;
import java.util.List;

public class TestTreeNodeComposite {
    public static void main(String[] args) {
        // 构造一棵树
        TreeNode leafNode1 = new LeafNode(1);
        TreeNode leafNode2 = new LeafNode(2);
        TreeNode leafNode3 = new LeafNode(3);
        TreeNode leafNode4 = new LeafNode(4);

        List<TreeNode> nonLeafNode1Kids = new ArrayList<>();
        nonLeafNode1Kids.add(leafNode1);
        nonLeafNode1Kids.add(leafNode2);

        List<TreeNode> nonLeafNode2Kids = new ArrayList<>();
        nonLeafNode2Kids.add(leafNode3);
        nonLeafNode2Kids.add(leafNode4);

        TreeNode nonLeafNode1 = new NonLeafNode(3, nonLeafNode1Kids);
        TreeNode nonLeafNode2 = new NonLeafNode(7, nonLeafNode2Kids);

        List<TreeNode> rootKids = new ArrayList<>();
        rootKids.add(nonLeafNode1);
        rootKids.add(nonLeafNode2);
        TreeNode root = new NonLeafNode(10, rootKids);

        //《多态递归调用》输出节点的值，可以从根节点开始遍历
        root.printNodeValue();// 先序：10 3 1 2 7 3 4 中序：1 2 3 3 4 7 10

        // 也可以从任一其他节点开始遍历，无需依赖其特定的数据结构，体现了组合模式使得用户对单个对象和组合对象的使用具有一致性的思想
        nonLeafNode2.printNodeValue();
    }
}
