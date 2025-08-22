import java.util.Scanner;
public class CountFactor {

    public static int Factors(int num){
        int count = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
                System.out.print(count+"]  "+i+"\n");
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        System.out.println("The number of Factors are :"+Factors(number));

    }
}
