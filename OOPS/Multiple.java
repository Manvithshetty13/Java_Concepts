package OOPS;

class  parent1{

}

interface parent2{
    public default void check(){
        System.out.println("Hello");
    }

}

class child extends parent1 implements parent2{
    int a;
    child(int a){
        this.a = a;
    }
}

public class Multiple {
    public static void main(String[] args) {
        parent2 p = new child(5);
        p.check();
        child a1 = new child(10);
        a1.check();
        System.out.println(a1.a);
    }
}
