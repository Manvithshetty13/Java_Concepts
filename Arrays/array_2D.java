package Arrays;
import java.util.Scanner;
public class array_2D {
    public static void Sum_of_2Dyarray(int arr[][],int rows,int col){
        int[] SumRows = new int[rows]; 
        int TotalSum=0;
        for(int i=0;i<rows;i++){
            int Sum = 0;
            for(int j=0;j<col;j++){
                Sum += arr[i][j];
            }
            SumRows[i]=Sum;
            TotalSum += Sum;
        }
        for(int i=0;i<rows;i++){
            System.out.print("The sum of "+(i+1)+"th row :"+SumRows[i]+"\n");
        }
        System.out.println("Sum of all the elments in the array :"+TotalSum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.print("Eneter the number of columns :");
        int col = sc.nextInt();
        int [][] arr = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        Sum_of_2Dyarray(arr, rows, col);
    }
    
}
