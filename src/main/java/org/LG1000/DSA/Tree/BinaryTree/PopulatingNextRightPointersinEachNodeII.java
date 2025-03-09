package org.LG1000.DSA.Tree.BinaryTree;

//117. Populating Next Right Pointers in Each Node II
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
public class PopulatingNextRightPointersinEachNodeII {
    private Node nextRightNode(Node root){
        if(root==null) return null;
        if(root.left!=null) return root.left;
        if(root.right!=null) return root.right;
        return nextRightNode(root.next);
    }
    public Node connect(Node root) {
        if(root==null) return root;

        if(root.left!=null && root.right!=null) root.left.next=root.right;

        if(root.left!=null && root.right==null){
            root.left.next=nextRightNode(root.next);
        }
        if(root.right!=null){
            root.right.next=nextRightNode(root.next);
        }

        //populate right first than go left
        connect(root.right);
        connect(root.left);

        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
