package org.Tree;

import java.util.ArrayList;
import java.util.List;

/*
 * œ»–Ú±È¿˙
 */
public class BinaryTreePreorderTraversal {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		preorder(result,root);
        return result;	
    }
	
	private void preorder(List<Integer> list,TreeNode root)
	{
		if(root == null)
			return;
		
		list.add(root.val);
		preorder(list,root.left);
		preorder(list,root.right);
	}
}
