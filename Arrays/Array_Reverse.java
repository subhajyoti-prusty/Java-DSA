/*
    Input: arr[] = {1, 4, 3, 2, 6, 5}  
    Output: {5, 6, 2, 3, 4, 1}

    Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 */

public class Array_Reverse {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        // reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}
