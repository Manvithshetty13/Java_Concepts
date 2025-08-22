public class numpattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j >= n - (i - 1) && j <= n + (i - 1)) {
                    System.out.print(count + " ");
                    if (j < n) {
                        count++;
                    } else {
                        count--;
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
