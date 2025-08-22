package OOPS;
import java.util.Scanner;
class circle_compute{

    double radius;

    circle_compute(double radius){
        this.radius = radius;
    }

    double compute_Area(){
        return (3.142 * radius * radius);
    }

    double compute_Perimeter(){
        return (2 * 3.142 * radius);
    }
}
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius :");
        double radius = sc.nextInt();
        circle_compute c1 = new circle_compute(radius);
        System.out.println("Area :"+c1.compute_Area()+"\n"+"Perimeter :"+c1.compute_Perimeter());
    }
}
