import java.util.Scanner;
public class Factorial {
    
    public static int Fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Fact(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        // int number = 4;
        System.out.println("The Factorial of the number "+number+ " = "+Fact(number));
    }
}