public class Pattern17 {
    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
