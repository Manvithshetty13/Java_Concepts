package OOPS;
import java.util.Scanner;
class Atm{
    Scanner sc = new Scanner(System.in);
    String acc_no;
    private int pin;
    private  double balance;
    // Atm(String acc_no , int pin , double balance){
    //     this.acc_no = acc_no;
    //     this.pin = pin;
    //     this.balance = balance;
    // }

    public void Set_pin(){
        System.out.print("Enter your pin : ");
        pin = sc.nextInt();
    }

    public int get_pin(){
        return pin;
    }

    public void Set_Balance(){
        System.out.print("Enter your Balance : ");
        balance = sc.nextDouble();
    }

    public double get_balance(){
        return balance;
    }

}

public class Example {
    public static void main(String[] args) {
        Atm coustumer1 = new Atm();
        coustumer1.Set_pin();
        System.out.println(coustumer1.get_pin());
    }
}
