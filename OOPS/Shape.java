package OOPS;

class shapes{
    String color;
    shapes(String color){
        this.color = color;
    }
} 

class square extends shapes{
    int side;
    square(String color , int side){
        super(color);
        this.side = side ;
    }

    public int Area(){
        return side*side;
    }
}

class triangle extends shapes{
    double base , height ;
    triangle(String color,double base , double height){
        super(color);
        this.base = base;
        this.height = height;
    }

    public double triange_area(){
        return 0.5*base*height;
    }
}

public class Shape {

    public static void main(String[] args) {
        square s1 = new square("red",20);
        System.out.println(s1.Area());
    }
    
}
