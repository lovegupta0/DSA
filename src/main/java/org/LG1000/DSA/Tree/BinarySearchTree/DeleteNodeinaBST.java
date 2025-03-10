package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//450. Delete Node in a BST
//https://leetcode.com/problems/delete-node-in-a-bst/description/
public class DeleteNodeinaBST {
    private int minValue(TreeNode root){
        int min=root.val;
        while(root!=null){
            min=root.val;
            root=root.left;
        }
        return min;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if (root.val<key) {
            root.right=deleteNode(root.right,key);
        }
        else {

            if (root.left==null && root.right==null) {
                root=null;
            }
            else if(root.left==null || root.right==null){
                return root.left==null? root.right: root.left;
            }
            else {
                root.val=minValue(root.right);
                root.right=deleteNode(root.right,root.val);
            }
        }

        return root;
    }
}
