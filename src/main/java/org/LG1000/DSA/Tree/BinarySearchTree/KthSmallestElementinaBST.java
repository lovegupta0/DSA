package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;
import java.util.*;
//230. Kth Smallest Element in a BST
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementinaBST {

    //Approach1
    class Approach1{
        int idx;
        int ans;
        private void get(TreeNode root,int k){
            if(root==null) return;
            get(root.left,k);
            idx++;
            if(idx==k) ans=root.val;
            get(root.right,k);
        }
        public int kthSmallest(TreeNode root, int k) {
            idx=0;
            ans=-1;
            get(root,k);
            return ans;
        }
    }

    //Approach2
    class Approach2{
        private void get(TreeNode root,int k,PriorityQueue<Integer> pq){
            if(root==null) return;
            get(root.left,k,pq);
            pq.add(root.val);
            if(pq.size()>k){
                pq.poll();
            }
            get(root.right,k,pq);
        }
        public int kthSmallest(TreeNode root, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            get(root,k,pq);
            return pq.peek();
        }
    }
}
