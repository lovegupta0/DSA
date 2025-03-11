package org.LG1000.DSA.Tree.BinarySearchTree;
import org.LG1000.DSA.Tree.TreeNode;

//1008. Construct Binary Search Tree from Preorder Traversal
//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/
public class ConstructBinarySearchTreefromPreorderTraversal {
    private TreeNode construct(int[] preorder,int pi,int pe){
        if(pi>pe) return null;
        TreeNode root=new TreeNode(preorder[pi]);
        int i=pi;
        for(;i<=pe;i++){
            if(preorder[pi]<preorder[i]) break;
        }
        int temp=pi;
        pi++;
        if(pi<=pe && preorder[pi]<preorder[temp]){
            root.left=construct(preorder,pi,i-1);
        }
        if(i<=pe && preorder[temp]<preorder[i]){
            root.right=construct(preorder,i,pe);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length-1;
        return construct(preorder,0,n);
    }
}
