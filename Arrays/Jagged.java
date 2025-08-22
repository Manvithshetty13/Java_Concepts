package Arrays;
import java.util.Scanner;

class Input{
    public static void Jagged_input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = sc.nextInt();
        int JaggedArray[][] = new int[rows][];
        for (int i = 0;i<rows;i++){
            System.out.println("Enter the number of columns in the "+(i+1)+" row :");
            int col = sc.nextInt();
            JaggedArray[i] = new int[col];
            col = 0;
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<JaggedArray[i].length;j++){
                System.out.print("Enter the "+(j+1)+" element in the "+(i+1)+" row :");
                JaggedArray[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<JaggedArray[i].length;j++){
                System.out.print(JaggedArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


public class Jagged{
    public static void main(String[] args) {

        Input.Jagged_input();
        
    }

}

