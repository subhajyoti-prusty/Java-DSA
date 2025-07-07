public class Check_if_the_Array_is_Sorted_I {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[i+1])
                    return false;
            }
        }
        return true;
    }
}