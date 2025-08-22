package OOPS;

// interface Demo{
//     public static final int i=10;
//     public abstract void Message();
// }

// abstract class Demo2{
//     public abstract void Message2();
// }

// class Demo3 extends Demo2{
//     @Override
//     public void Message2(){
//         System.out.println("Hello!!!");
//     }
// }

// class Demo4 implements Demo{
//     @Override
//     public void Message(){
//         System.out.println("hi!!!");
//         System.out.println(i);
//     }
// }

// public class class1 {
//     public static void main(String[] args) {
//         Demo4 child1 = new Demo4();
//         Demo3 child2 = new Demo3();

//         child1.Message();
//         child2.Message2();
//     }
    
// }

interface class1{
    public final int i = 10;
    static final String str="numbers";

    private static void display(){
        System.out.println("Cant access");
    }

    public default void Message(){
        System.out.println("Hey!!!!");
    }

    public default void main(String[] args) {
        System.out.println(i + str);
        display();
        Message();
    }
}