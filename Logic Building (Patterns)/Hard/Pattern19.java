public class Pattern19 {
    public void pattern19(int n) {
        int spaces = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = n; j >= 1 + i; j--){
                System.out.print("*");
            }

            spaces += 2;
            System.out.println();
        }

        spaces = 2 * n - 2;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            spaces -= 2;
            System.out.println();
        }
    }
}
