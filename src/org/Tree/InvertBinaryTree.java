package org.Tree;

/*
 * Invert a binary tree.

	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
to
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		swap(root);
		return root;
	}
	
	private void swap(TreeNode root)
	{
		if(root!=null)
		{
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		else
		{
			return;
		}
		
		swap(root.left);
		swap(root.right);
	}
}
