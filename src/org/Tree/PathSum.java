package org.Tree;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
        	return false;
        return isLeafAndZero(root,sum);
        	
    }
	
	private boolean isLeafAndZero(TreeNode root,int sum)
	{
		boolean result = false;
        
        if(root.left == null && root.right == null)
        {
        	if(sum == root.val)
        		return true;
        	else
        		return false;
        }
        else
        {
        	return result || hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
        }
	}
}
