package org.LG1000.DSA.Tree.BinarySearchTree;

import org.LG1000.DSA.Tree.TreeNode;

//701. Insert into a Binary Search Tree
//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);

        if(root.val<val){
            root.right=insertIntoBST(root.right,val);
        }
        else root.left=insertIntoBST(root.left,val);

        return root;
    }
}
