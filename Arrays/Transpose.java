package Arrays;

import java.util.Scanner;

public class Transpose {
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

        int[][] transpose = new int[col][rows];
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }   
}
