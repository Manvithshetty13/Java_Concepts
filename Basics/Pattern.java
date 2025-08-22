public class Pattern {
    public static void main(String[] args) {
        // int count = 0;
        // int  i;
        // int n=4;

        // for (i = 1;i<=n;i++){
        //     System.out.print("*\t");
        //     if(i%n==0){
        //         System.out.print("\n");
        //         i=0;
        //         count++;
        //     }


        //     if (count == n){
        //         break;
        //     }
        // }
        int n=4;
        char letter = 'a';

        for(char i =1;i<=n*n;i++ ){
            System.out.print(letter+"\t");
            letter++;
            if (i%n==0){
                System.out.print("\n");
            }
        }
        
    }
}
