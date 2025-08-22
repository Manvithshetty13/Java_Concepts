import java.util.*;
public class Factors {

    public static Boolean Spy(int num ){
        int product = 1;
        int sum = 0;
        while(num!=0)
        {
            product *= (num%10);
            sum += (num%10);
            num /= 10;
        }
        return sum == product;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (Spy(number)){
                System.out.println("The given Number is a Spy number");
        }
        else{
            System.out.println("The given Number is not a Spy number");
        }

    }
}
