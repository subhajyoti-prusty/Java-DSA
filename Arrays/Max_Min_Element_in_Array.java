/*
    Input: arr[] = {3, 5, 4, 1, 9}
    Output: Minimum element is: 1
            Maximum element is: 9
 */
public class Max_Min_Element_in_Array {
    public static int Min(int A[], int N) {
        int min = A[0];
        for (int i = 0; i < N; i++) {
            if (min > A[i]) {
                min = A[i];
            }
        }
        return min;
    }

    public static int Max(int A[], int N) {
        int max = A[0];

        for (int i = 0; i < N; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum element is: " + Min(A, N));
        System.out.println("Maximum element is: " + Max(A, N));
    }
}
