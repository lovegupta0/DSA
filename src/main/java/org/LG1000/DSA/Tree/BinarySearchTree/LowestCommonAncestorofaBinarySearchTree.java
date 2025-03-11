package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//235. Lowest Common Ancestor of a Binary Search Tree
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
public class LowestCommonAncestorofaBinarySearchTree {
    //Approach1
    //common approach of binary tree
    class Approach1{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null) return null;
            if(root.val==p.val || root.val==q.val) return root;

            TreeNode l=lowestCommonAncestor(root.left,p,q);
            TreeNode r=lowestCommonAncestor(root.right,p,q);
            if(l!=null && r!=null) return root;

            return l==null?r:l;
        }
    }

    //Approah2
    // utilizing the properties of binary search tree
    class Approach2{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null) return null;
            if(root==p || root==q) return root;
            if((root.val>p.val && root.val<q.val) || (root.val>q.val && root.val<p.val)) return root;

            if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left,p,q);
            else return lowestCommonAncestor(root.right,p,q);
        }
    }
}
