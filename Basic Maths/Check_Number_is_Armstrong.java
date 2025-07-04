public class Check_Number_is_Armstrong {
    public boolean isArmstrong(int n) {
        int number = n;
        int length = String.valueOf(n).length();

        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit,length);
            n = n/10;
        }

        if (number == sum){
            return true;
        }
        return false;
    }
}
