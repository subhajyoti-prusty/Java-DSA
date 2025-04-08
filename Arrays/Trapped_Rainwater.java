public class Trapped_Rainwater {
    public static int trappedWater(int arr[]) {
        int TrappedWater = 0;
        int n = arr.length;
        int leftMaxBoundry[] = new int[n];
        int rightMaxBoundry[] = new int[n];

        // Left Max calculation
        leftMaxBoundry[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundry[i] = Math.max(arr[i], leftMaxBoundry[i - 1]);
        }

        // Right Max calculation
        rightMaxBoundry[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max(arr[i], rightMaxBoundry[i + 1]);
        }

        // Trapped water calculation
        for (int i = 0; i < n; i++) {
            int waterHeight = Math.min(leftMaxBoundry[i], rightMaxBoundry[i]);
            TrappedWater += (waterHeight - arr[i]);
        }

        return TrappedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int WaterCount;

        try {
            if (arr.length < 3) {
                throw new Exception("Array too short to trap water.");
            } else {
                WaterCount = trappedWater(arr);

                System.out.println("The amount of water trapped is: " + WaterCount);
            }
        } catch (Exception e) {
            System.out.println("Can't trap any water.");
        }
    }
}
