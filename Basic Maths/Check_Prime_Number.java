public class Check_Prime_Number {
    public boolean isPrime(int n) {
        if(n < 2){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
