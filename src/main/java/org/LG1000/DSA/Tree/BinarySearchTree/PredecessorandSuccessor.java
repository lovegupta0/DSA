package org.LG1000.DSA.Tree.BinarySearchTree;

public class PredecessorandSuccessor {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        if(root==null) return;

        if(root.data==key){
            Node p=root.left;
            Node s=root.right;
            while(p!=null){
                pre[0]=p;
                p=p.right;
            }
            while(s!=null){
                suc[0]=s;
                s=s.left;
            }
        }

        else if(root.data<key){
            pre[0]=root;
            findPreSuc(root.right,pre,suc,key);
        }
        else{
            suc[0]=root;
            findPreSuc(root.left,pre,suc,key);
        }

    }
}
