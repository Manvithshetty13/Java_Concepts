package OOPS;

class Vehicle{
    String brand;
    String location;

    Vehicle(String brand , String location ){
        this.brand = brand;
        this.location = location;
    }
}

class Car extends Vehicle{
    int hp;
    double Price;
    Car(String brand , String location , int hp , double Price){
        super(brand,location); 
        this.hp = hp;
        this.Price = Price;
    }

    void start(){
        System.out.println("staring");
    }

    void displayProperties(){
        System.out.println(hp);
        System.out.println(Price);
        System.out.println(brand);
        System.out.println(location);
    }
}

public class showroom {
    public static void main(String[] args) {
        Car c1 = new Car("bmw" , "india", 2300 , 8000000 );
        c1.displayProperties();
    }
}
