public class Return_the_Largest_Digit_in_a_Number {
    public int largestDigit(int n) {
        int max = 0;

        while(n > 0){
            int digit = n % 10;
            if(digit > max){
                max = digit;
            }
            n = n/10;
        }
        return max;
    }
}
