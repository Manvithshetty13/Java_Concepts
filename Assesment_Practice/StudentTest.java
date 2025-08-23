package Assesment_Practice;
import java.util.Scanner;
class Student{
    private int id;
    private String name;
    private double marks;
    Student(int id , String name , double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade(double marks){
        if(marks >= 85){
            return "A";
        } else if(marks >= 70 && marks<85){
            return "B";
        } else if(marks >= 50 && marks < 70){
            return "C";
        } else {
            return "D";
        }
    }

}
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students : ");
        int n = sc.nextInt();
        Student S[] = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            S[i] = new Student(id, name, marks);
        }

        for(int i = 0; i < n; i++) {
            System.out.println("name : " + S[i].getName() + "  id :" + S[i].getId() + "  marks : " + S[i].getMarks() + "  grade : " + S[i].getGrade(S[i].getMarks()));
        }

        
    }
}
