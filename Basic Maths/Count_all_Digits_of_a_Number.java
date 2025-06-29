public class Count_all_Digits_of_a_Number {
    public int countDigit(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0){
            count += 1;
            n = n/10;
        }
        return count;
    }
}
