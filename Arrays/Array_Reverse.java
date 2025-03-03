/*
    Input: arr[] = {1, 4, 3, 2, 6, 5}  
    Output: {5, 6, 2, 3, 4, 1}

    Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 */

public class Array_Reverse {

    public static void reverseArray(int arr[], int n){

        int arr1[] =  new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[n-i-1];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        int n = 6;

        reverseArray(arr,n);
    }
}
