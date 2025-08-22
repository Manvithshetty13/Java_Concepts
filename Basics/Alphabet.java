package Basics;
import java.util.Scanner;


public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet :");
        char alpha = sc.next().charAt(0);
        if (alpha <= 97 ){
            System.out.println("Upper Case");
        }     
        else{
            System.out.println("lower Case");
        }
	}
}