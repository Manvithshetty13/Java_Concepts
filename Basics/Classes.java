package Basics;
import java.util.Scanner;

class student {
    String USN;
    String name;

    public student(String USN ,String name){
            this.USN = USN;
            this.name = name;
    }
}


public class Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        student[] S = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the USN of the " + (i + 1) + "th Student:");
            String usn = sc.next();
            System.out.println("Enter the name of the " + (i + 1) + "th Student:");
            String name = sc.next();
            S[i] = new student(usn, name);
        }
        
        try {

            for(int j=0;j<=n;j++){
                System.out.println(j+1 + "]  " + "Name :"+S[j].name +"  USN :"+S[j].USN +"\n");
            }
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ok");
        }
    }
    
}
