
public class Kth_Smallest_or_Largest_Element {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[k - 1];
    }

    public static int kthLargest(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = {4,10,2,7,8,14,1};
        int k = 3;

        System.out.println(k + "th Smallest Element is " +kthSmallest(arr, k));
        System.out.println(k + "th Largest Element is " +kthLargest(arr, k));
    }
}