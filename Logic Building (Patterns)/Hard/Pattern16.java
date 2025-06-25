public class Pattern16 {
    public void pattern16(int n) {
        for(int i = 0; i < n; i++){
            for(char j = 0; j <= i; j++){
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
    }
}
