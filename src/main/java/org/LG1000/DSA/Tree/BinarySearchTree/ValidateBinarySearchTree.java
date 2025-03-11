package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//98. Validate Binary Search Tree
//https://leetcode.com/problems/validate-binary-search-tree/description/
public class ValidateBinarySearchTree {
    private boolean check(TreeNode root,long left, long right){
        if(root==null) return true;
        if(root.val<=left || root.val>=right) return false;

        return check(root.left,left,root.val) && check(root.right,root.val,right);
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
