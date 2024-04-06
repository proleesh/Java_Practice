package com.proleesh.ex31.test13;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BinaryTreeInorder {
    void main(){
//        TreeNode root = new TreeNode(1);
//        root.left = null;
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        System.out.println(binaryTree(root));

//        TreeNode root2 = new TreeNode();
//        System.out.println(binaryTree(root2));

        TreeNode root3 = new TreeNode(1);
        System.out.println(binaryTree(root3));

    }
    List<Integer> list = new ArrayList<>();

    public List<Integer> binaryTree(TreeNode root){
        if(root == null) return new ArrayList<>();

        binaryTree(root.left);
        list.add(root.val);
        binaryTree(root.right);
        return list;
    }


}
