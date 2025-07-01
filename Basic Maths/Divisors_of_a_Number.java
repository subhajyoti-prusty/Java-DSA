import java.util.Arrays;

public class Divisors_of_a_Number {
    public int[] divisors(int n) {
        // int index = 0;
        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0){
        //         index += 1;
        //     }
        // }

        // int[] Arr = new int[index];
        int[] Arr = new int[n];

        int index = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                Arr[index] = i;
                index += 1;
            }
        }

        int[] ans = Arrays.copyOf(Arr,  index);
        return ans;
    }
}
