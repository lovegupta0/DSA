package org.LG1000.DSA.Tree.BinaryTree;
import org.LG1000.DSA.Tree.TreeNode;

//226. Invert Binary Tree
//https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;
    }
}
