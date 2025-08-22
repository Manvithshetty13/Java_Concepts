package Arrays;
import java.util.Scanner;
public class SumArray{

    public static int Sum_Array(int array[],int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += array[i];
        }
        return sum;
    }

    public static int Mult_even(int array[],int n){
        int product = 1;
        for(int i=0;i<n;i=i+2){
            if(i%2==0){
                product *= array[i];
            }
        }
        return product;
    }

    public static String Dual(int array[] , int n ){
        int sum = 0 , product = 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum += array[i];
            }
            else{
                product *= array[i];
            }

        }
        return "Sum of even :" + sum + "\n" +"Product of Odd : "+product;
    }

    public static void Reverse(int array[] , int n){
        int j = n-1;
        for(int i = 0;i<n;i++){
            int temp = 0;
            if(i==(array.length-1) / 2){
                if(array.length%2==0){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    break;
                }
                else{
                    break;
                }
                
            }
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }

        Reverse(arr, n);

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[]);
        // }

        // System.out.print(Dual(arr, n));
        
        //System.out.println("Sum of the array is :"+Sum_Array(arr, n));
        //System.out.println("Product of the array in even index is :"+Mult_even(arr, n));
    }
}