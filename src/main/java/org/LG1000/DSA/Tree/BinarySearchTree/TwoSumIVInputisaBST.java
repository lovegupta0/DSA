package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//Two Sum IV - Input is a BST
//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
public class TwoSumIVInputisaBST {
    boolean ans=false;
    private boolean find(TreeNode root,int key){
        if(root==null) return false;
        if(root.val==key) return true;
        if(root.val>key) return find(root.left,key);
        else return find(root.right,key);
    }
    private void get(TreeNode root,TreeNode head,int k){
        if(root==null) return;
        get(root.left,head,k);
        int val=k-root.val;

        if(find(head,val) && val!=root.val){
            ans=true;
            return;
        }

        get(root.right,head,k);

    }
    public boolean findTarget(TreeNode root, int k) {
        get(root,root,k);
        return ans;
    }
}
