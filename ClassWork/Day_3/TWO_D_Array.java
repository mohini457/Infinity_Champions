

import java.util.Scanner;

public class TWO_D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(arr);
    }
}
        // Display(arr);
        // Row_Wise_Traversal(arr);
        // Column_Wise_Traversal(arr);
        // Reverse_Traversal(arr);
        // Spiral_Traversal(arr);

    // }

    // public static void Display(int nums[][]){
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[0].length;j++){
    //             System.out.print(nums[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void Row_Wise_Traversal(int nums[][]){
    //     System.out.print("Row-Wise-Traversal: ");
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[0].length;j++){
    //             System.out.print(nums[i][j]+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void Column_Wise_Traversal(int nums[][]){
    //     System.out.print("Column-Wise-Traversal: ");
    //     for(int j=0;j<nums[0].length;j++){
    //         for(int i=0;i<nums.length;i++){
    //             System.out.print(nums[i][j]+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void Reverse_Traversal(int nums[][]){
    //     System.out.print("Reverse-Wise-Traversal: ");
    //     for(int i=nums.length-1;i>=0;i--){
    //         for(int j=nums[0].length-1;j>=0;j--){
    //             System.out.print(nums[i][j]+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void Spiral_Traversal(int nums[][]){
    //     System.out.print("Spiral-Traversal: ");
    //     int top=0,bottom=nums.length-1;
    //     int left=0,right=nums[0].length-1;
    //     while(top<=bottom && left<=right){
    //         for(int i=left; i<=right;i++){
    //             System.out.print(nums[top][i]+" ");
    //         }
    //         top++;
    //         for(int i=top;i<=bottom;i++){
    //             System.out.print(nums[i][right]+" ");
    //         }
    //         right--;
    //         if(top<=bottom){
    //             for(int i=right;i>=left;i--){
    //                 System.out.print(nums[bottom][i]+" ");
    //             }
    //         }
    //         bottom--;
    //         if(left<=right){
    //             for(int i=bottom;i>=top;i--){
    //                 System.out.print(nums[i][left]+" ");
    //             }
    //         }
    //         left++;
    //     }
    //     System.out.println();
    // }



    
// }
