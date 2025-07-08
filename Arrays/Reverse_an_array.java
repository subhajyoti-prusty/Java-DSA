public class Reverse_an_array {
    public void reverse(int[] arr, int n) {
        int[] reverse = new int[n];

        for (int i = n-1; i >= 0; i--) {
            reverse[n-i-1] = arr[i];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = reverse[i];
        }

        return;
    }
}
