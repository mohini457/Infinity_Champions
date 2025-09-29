

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.print(searchMatrix(matrix, target));
        
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=0;
        int n=matrix[0].length-1;
        while(m<matrix.length && n>=0){
            if(matrix[m][n]==target){
                return true;
            }
            else if(matrix[m][n]>target){
                n--;
            }
            else{
                m++;
            }
        }
        return false;
    }
}
