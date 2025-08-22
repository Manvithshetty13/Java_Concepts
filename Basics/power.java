import java.util.*;
public class power {
    
    static int Powered(int num , int pow){

        int Answer = 1;
        for (int i = 1;i<=pow;i++){
            Answer *= num ;
        }
        return Answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base :");
        int base = sc.nextInt();
        System.out.print("Enter the Power :");
        int Power = sc.nextInt();

        System.out.println("The Answer is :" + Powered(base, Power));
    }
}
