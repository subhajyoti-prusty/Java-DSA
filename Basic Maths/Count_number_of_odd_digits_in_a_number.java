public class Count_number_of_odd_digits_in_a_number {
    public int countOddDigit(int n) {
        if (n == 0) return 0;
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 != 0){
                count += 1;
            }
            n = n/10;
        }
        return count;
    }
}
