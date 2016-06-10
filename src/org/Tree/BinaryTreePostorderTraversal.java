package org.Tree;

import java.util.ArrayList;
import java.util.List;

/*
 * ∫Û–Ú±È¿˙
 */
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		postorder(list,root);
        return list;
    }
	
	private void postorder(List<Integer> list,TreeNode root)
	{
		if(root == null)
			return;
		
		postorder(list,root.left);
		postorder(list,root.right);
		list.add(root.val);
	}
}
