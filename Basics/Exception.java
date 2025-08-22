import java.util.*;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int m;
        System.out.println("Enter the number");
        m = sc.nextInt();
        try{
            int answer = n/m ;
        
            System.out.println(answer);
        }

        catch (ArithmeticException e) {
                System.out.println("Invalid input");
        }

        finally{
            System.out.println("bvc sari input koda");
        }

    }
}
