public class Palindrome_Number {
    public boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = (10 * reverse) + digit;
            n = n/10;
        }

        return reverse == original;
    }
}
