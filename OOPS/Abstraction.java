package OOPS;

abstract class parent {
    public abstract void display();
    public abstract int sum(int a , int b);
}

class child extends parent{
    @Override
    public void display(){
        System.out.println("Hello!!");
    }

    
}

class math extends parent{
   
    public int sum(int a,int b){
        return a-b;
    }
}


public class Abstraction{
    public static void main(String[] args) {
        child c = new child();
        math m = new math();
        c.display();
        System.out.println(m.sum(10, 20));
    }
}