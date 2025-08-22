public class Pascal {
    public static void main(String[] args) {
        int n = 5;
        int[][] pascal = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1; 
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= n - i - 1 && j <= n + i - 1 && (j - (n - i - 1)) % 2 == 0) {
                    int pos = (j - (n - i - 1)) / 2;
                    System.out.print(pascal[i][pos] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

