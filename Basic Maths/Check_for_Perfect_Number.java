public class Check_for_Perfect_Number {
    public boolean isPerfect(int n) {
        int sum = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(sum == n){
            return true;
        }
        return false;
    }
}
