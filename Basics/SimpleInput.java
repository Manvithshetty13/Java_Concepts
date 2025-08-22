
import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array filled.");
    }
}
