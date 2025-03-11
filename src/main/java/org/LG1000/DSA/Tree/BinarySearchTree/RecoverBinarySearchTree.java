package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//99. Recover Binary Search Tree
//https://leetcode.com/problems/recover-binary-search-tree/description/
public class RecoverBinarySearchTree {
    TreeNode first=null;
    TreeNode mid=null;
    TreeNode last=null;
    TreeNode prev=null;
    private void swap(TreeNode a,TreeNode b){
        int val=a.val;
        a.val=b.val;
        b.val=val;
    }

    private void search(TreeNode root){
        if(root==null) return;
        search(root.left);
        if(prev!=null){
            if(prev.val>root.val){
                if(first==null){
                    first=prev;
                    mid=root;

                }
                else last=root;
            }
        }
        prev=root;
        search(root.right);
    }
    public void recoverTree(TreeNode root) {
        search(root);
        if(last!=null) swap(first,last);
        else swap(first,mid);
    }
}
