import java.util.Scanner;

public class Happy {

    public static int Square_digits(int num){
        int Sum =0;
        while(num!=0){
            int Square =(num%10)*(num%10);
            Sum += Square;
            num /= 10;
        }

        return Sum;
    }


    public static Boolean happy(int happy){
        while(happy > 9){
            happy = Square_digits(happy);
        }

        return happy == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if(happy(number)){
            System.out.println("Number is a Happy number");
        }
        else{
            System.out.println("Not a Happy number");
        }
    }
}
