package OOPS;
class Box{
    double height;
    double width;

    Box(double height , double width){
        this.height = height;
        this.width = width;
    }

    double compute_Area(){
        return height*width;
    }
}
public class BoxProblem {
    public static void main(String[] args) {
        Box[] box = new Box[10];
        box[0] = new Box(10 , 20);
        System.out.println("Area :"+box[0].compute_Area());
    }
}
