
import org.Array.SearchA2DMatrix;
import org.Pointer.SearchForARange;
import org.Tree.PathSum;
import org.Tree.TreeNode;
public class Program {

	public static void main(String[] args) {
		SearchA2DMatrix a  = new SearchA2DMatrix();
		
		int[][] matrix = new int[][]{
			{1,3,5,7},{10,11,16,20},{23,30,34,50}
		};
		boolean result = a.searchMatrix(matrix, 3);
		System.out.println(result);
	}

}
