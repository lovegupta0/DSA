package org.LG1000.DSA.Tree.BinarySearchTree;

//Largest BST
//https://www.geeksforgeeks.org/problems/largest-bst/1
public class LargestBST {
    private static NodeData get(Node root){
        //Here instead of creating node data with min,max -> use max,min
        if(root==null) return new NodeData(Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        NodeData left=get(root.left);
        NodeData right=get(root.right);

        //compare should be done as below
        if(left.r<root.data && root.data<right.l){
            //check & provide l min & r max with root data
            return new NodeData(Math.min(left.l,root.data),Math.max(root.data,right.r),right.count+left.count+1);
        }

        //here return with min,max, max(lmaxcount,rmaxcount)
        return new NodeData(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.count,right.count));
    }
    static int largestBst(Node root)
    {
        return get(root).count;

    }
}

class NodeData{
    int l;
    int r;
    int count;

    NodeData(int l,int r,int count){
        this.l=l;
        this.r=r;
        this.count=count;
    }
}
