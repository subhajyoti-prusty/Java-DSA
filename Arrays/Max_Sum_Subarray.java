public class Max_Sum_Subarray {
    public static void maxSumSubarray(int arr[]) {
        int totalSum = 0 , maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println("Sum of subarray [" + i + "," + j + "] = " + sum);
                if (maxsum < sum ) {
                    maxsum = sum;
                }
                totalSum += sum;
            }
        }
        System.out.println("Max sum is: "+ maxsum);
        System.out.println("Total Sum of All Subarrays: " + totalSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSumSubarray(arr);
    }
}
