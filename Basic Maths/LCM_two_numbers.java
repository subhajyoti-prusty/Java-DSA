public class LCM_two_numbers {
    public int GCD(int n1, int n2) {
        int largest = 0;
        int GCD = 1;

        if(n1 > n2){
            largest = n1;
        }else{
            largest = n2;
        }

        for(int i = 1; i <= largest; i++){
            if(n1 % i == 0 && n2 % i == 0){
                GCD = i;
            }
        }

        return GCD;
    }
    public int LCM(int n1, int n2) {
        int LCM = n1*n2;
        int GCD = GCD(n1,n2);

        LCM = LCM / GCD;

        return LCM;
    }
}
