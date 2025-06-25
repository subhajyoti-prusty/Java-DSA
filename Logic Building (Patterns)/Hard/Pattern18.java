public class Pattern18 {
    public void pattern18(int n) {
        for(int i = 1; i <= n; i++){
            char ch = (char)('A'+ n - i);
            for(int j = 0; j < i; j++){
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
    }
}
