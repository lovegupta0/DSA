package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;
import java.util.*;

//173. Binary Search Tree Iterator
//https://leetcode.com/problems/binary-search-tree-iterator/description/

// T.C. --> O(1) && S.C --> O(H)
public class BinarySearchTreeIterator {
    Stack<TreeNode> st;
    private void fill(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    public BinarySearchTreeIterator(TreeNode root) {
        st=new Stack<>();
        fill(root);
    }

    public int next() {
        TreeNode root=st.pop();
        int val=root.val;
        fill(root.right);
        return val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }
}
