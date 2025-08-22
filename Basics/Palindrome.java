import java.util.Scanner;
public class Palindrome {
    static Boolean Reverse(int num){
        int number = 0;
        int count  = 0;
        int mult = 1;
        int num2 = num;
        int num3 = num;
        while(num!=0){
            num /=10;
            count += 1;
        }

        for (int i = 1;i<=count-1;i++){
            mult*=10;
        }

        while(num2!=0){
            number = number + ((num2%10) * mult);
            num2 /=10;
            mult /=10;
        }

        return number==num3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if(Reverse(number)){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
