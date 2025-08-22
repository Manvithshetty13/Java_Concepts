package OOPS;
/*-When there is no constructor in the class the compiler creates a 
   default constructor and stores default values in them ig: 0 , NULL
  
   USER DEFINED CONSTRUCTOR
   -the constructor desinged by the user is called a user defined constructor
   

   -non static variable can be accessed directly inside non static methods , constructor 
   non static block
   -cannot be used inside static methods 
*/
public class Basic{
    public static void main(String[] args) {
        Student[] S = new Student[10];
        S[0] = new Student("Manvith");

        System.out.println(S[0].name);

    }
}