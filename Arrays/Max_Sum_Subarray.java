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

    public static int kadanesAlgorithm(int arr[]) {
        if(arr.length == 1) return arr[0];
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentsum = currentsum + arr[i];

            maxSum = Math.max(currentsum, maxSum);

            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSumSubarray(arr);

        int arr1[] = { -2, -4, -6, -8, -10, -12, -14 };
        int maxValue  = kadanesAlgorithm(arr1);
        System.out.println(maxValue);
    }
}
