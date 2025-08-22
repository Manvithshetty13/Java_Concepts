import java.util.Scanner;
public class countdigit {
    
    public static int CountDigit(int num){
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        System.out.println("The number of digits in this number are :" + CountDigit(number));
    }
}
