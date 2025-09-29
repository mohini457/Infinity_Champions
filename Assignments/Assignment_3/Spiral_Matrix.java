import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        // List<Integer> ll = spiralOrder(matrix);
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int minc=0, minr=0, maxc=matrix[0].length-1, maxr=matrix.length-1;
        List<Integer> result = new ArrayList<>();
		int t=matrix.length*matrix[0].length;
		int count=0;
		while(count<t) {
		for(int i=minc;i<=maxc && count<t;i++) {
			result.add(matrix[minr][i]);
			count++;
		}
		minr++;
	    for(int i=minr;i<=maxr && count<t;i++) {
		    result.add(matrix[i][maxc]);
		    count++;
	    }
	    maxc--;
	    for(int i=maxc;i>=minc && count<t ;i--) {
		   result.add(matrix[maxr][i]);
		    count++;
	    }
	    maxr--;
	    for(int i=maxr;i>=minr && count<t;i--) {
		    result.add(matrix[i][minc]);
		    count++;
	    }
	    minc++;
	}
    return result;
    }
}
