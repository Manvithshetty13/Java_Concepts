import java.util.Scanner;
public class Reverse {

    static int Reverse(int num){
        int number = 0;
        int count  = 0;
        int mult = 1;
        int num2 = num;
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

        return number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter the number :");
        int number = sc.nextInt();
        System.out.println("The reversed number is :" + Reverse(number));

    }
    
}
