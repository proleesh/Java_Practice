package com.proleesh.ex31.test13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorder {

    void main(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        System.out.println(preOrder(root));
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> preOrder(TreeNode root){
        if(root == null) return new ArrayList<>();


        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);


        return list;
    }


}
