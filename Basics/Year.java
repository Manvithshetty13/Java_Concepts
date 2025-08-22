import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year :");
        int year = sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    System.err.println("leapyear");
                }
                else{
                    System.err.println("Not leap");
                }
            }
            else{
                System.err.println("Leap year");
            }
        }
        else{
            System.err.println("not Leap");
        }
    }
}
