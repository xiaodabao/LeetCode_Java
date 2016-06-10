package org.Tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * ÖÐÐò±éÀú,µÝ¹é
 */
public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		inorder(list,root);
        return list;
    }
	
	private void inorder(List<Integer> list,TreeNode root)
	{
		if(root == null)
			return;
		
		inorder(list,root.left);
		list.add(root.val);
		inorder(list,root.right);
	}
}
