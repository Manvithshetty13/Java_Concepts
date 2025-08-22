

class Battery{
    private int capacity;
    Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
}

class Phone{
    String brand;
    int camera;
    private Battery b;
    Phone(String brand , int camera , int capacity){
        this.brand = brand ;
        this.camera = camera;
        b = new Battery(capacity);
    }

    public Battery getbattery(){
        return b;
    }
    public void setBattery(Battery b){
        this.b=b;
    }
}
public class Mobile {
    public static void main(String[] args) {
        Phone p = new Phone("Nokia" , 50 , 69);
        System.out.println(p.brand);
        System.out.println(p.camera);
        System.out.println(p.getbattery().getCapacity());
        p.getbattery().setCapacity(32);
        System.out.println(p.getbattery().getCapacity());
    }
    
}
