package org.LG1000.DSA.Tree.BinaryTree;
import org.LG1000.DSA.Tree.TreeNode;

//112. Path Sum
//https://leetcode.com/problems/path-sum/description/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(targetSum-root.val==0 && root.left==null && root.right==null) return true;

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

    }

}
