public class Count_of_odd_numbers_in_array {
    public int countOdd(int[] arr, int n) {
       int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0)
            count++;      
        }

       return count;
    }
}
