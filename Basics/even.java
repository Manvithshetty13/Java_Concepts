
import java.util.Scanner;

public class even {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frequency");
        int n = sc.nextInt();
        int i=1,count =1;
        do { 
            System.out.println(i);
            i+=2;
            count++;
        } while (count<=n);
        
    }

}