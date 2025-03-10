package org.LG1000.DSA.Tree.BinarySearchTree;

//Ceil in BST
//https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1
public class CeilinBST {
    //Approach1
    class Approach1{
        int findCeil(Node root, int key) {
            if (root == null) return -1;

            if(root.data==key) return key;

            int r=-1,l=-1;
            if(root.data<key){
                r=findCeil(root.right,key);
            }
            else {
                l=findCeil(root.left,key);
            }

            if(l==key || r==key) return l==key?l:r;

            if(r==-1){
                if(key>root.data) return -1;
                return key<l?l:root.data;
            }

            if(l==-1){
                if(key>r) return -1;
                return key<root.data?root.data:r;
            }


            return key<l?l:key<root.data?root.data:key<r?r:-1;


        }
    }

    //Approach2
    class Approach2{
        int findCeil(Node root, int key) {
            if (root == null) return -1;

            if(root.data==key) return key;

            if(root.data<key){
                return findCeil(root.right,key);
            }

            int ceil=findCeil(root.left,key);

            return ceil>=key?ceil:root.data;


        }
    }
}

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
