package org.LG1000.DSA.Tree.BinarySearchTree;

//Floor in BST
//https://www.geeksforgeeks.org/problems/floor-in-bst/1
public class FloorinBST {
    public static int floor(Node root, int x) {
        if(root==null) return -1;

        if(root.data==x) return x;

        if(root.data>x) return floor(root.left,x);

        int floorData=floor(root.right,x);

        return floorData<=x && floorData!=-1?floorData:root.data;
    }

}
