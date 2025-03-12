package org.LG1000.DSA.Tree.BinaryTree;
import org.LG1000.DSA.Tree.TreeNode;

//1028. Recover a Tree From Preorder Traversal
//https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/description/
public class RecoveraTreeFromPreorderTraversal {
    private int getDashCount(String s){
        if(s==null) return 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-') count++;
            else break;
        }
        return count;
    }
    private int getNumIndex(String s,int i){
        if(s==null) return 0;
        for(;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) break;
        }

        return i;
    }
    private void get(TreeNode root,String[] s,int d){
        if(s[0].length()==0) return;
        int depth=getDashCount(s[0]);
        if(depth!=d) return;
        int n=getNumIndex(s[0],depth);
        String num=s[0].substring(depth,n);
        TreeNode left=new TreeNode(Integer.parseInt(num));
        root.left=left;
        s[0]=s[0].substring(n);
        get(root.left,s,d+1);
        depth=getDashCount(s[0]);
        if(depth!=d) return;
        n=getNumIndex(s[0],depth);
        num=s[0].substring(depth,n);
        TreeNode right=new TreeNode(Integer.parseInt(num));
        root.right=right;
        s[0]=s[0].substring(n);
        get(root.right,s,d+1);


    }
    public TreeNode recoverFromPreorder(String traversal) {
        String[] s=new String[1];
        int n=getNumIndex(traversal,0);
        String num=traversal.substring(0,n);
        TreeNode root=new TreeNode(Integer.parseInt(num));
        s[0]=traversal.substring(n);
        get(root,s,1);
        return root;

    }
}
