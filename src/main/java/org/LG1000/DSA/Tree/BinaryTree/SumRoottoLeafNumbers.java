package org.LG1000.DSA.Tree.BinaryTree;
import org.LG1000.DSA.Tree.TreeNode;

//129. Sum Root to Leaf Numbers
//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
public class SumRoottoLeafNumbers {

    //Approach1
    class Approach1{
        private void sumLeafNumbers(TreeNode root,int num,int[] sum){
            if(root==null) return;

            if(root.left==null && root.right==null){
                num=num*10+root.val;
                sum[0]+=num;
            }
            sumLeafNumbers(root.left,num*10+root.val,sum);
            sumLeafNumbers(root.right,num*10+root.val,sum);
        }
        public int sumNumbers(TreeNode root) {
            int[] sum=new int[1];
            sum[0]=0;

            sumLeafNumbers(root,0,sum);

            return sum[0];
        }
    }

    //Approach2
    class Approach2{
        public int sumTree(TreeNode root,int sum){
            if(root==null) return 0;
            if(root.left==null && root.right==null) return sum=sum*10+root.val;
            return sumTree(root.left,sum*10+root.val)+sumTree(root.right,sum*10+root.val);
        }
        public int sumNumbers(TreeNode root) {
            return sumTree(root,0);
        }
    }

}
