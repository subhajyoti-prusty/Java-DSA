public class Reverse_a_Number {
    public int reverseNumber(int n) {
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = (10 * reverse) + digit;
            n = n/10;
        }
        return reverse;
    }    
}
