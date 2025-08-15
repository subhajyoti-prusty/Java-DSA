import java.util.Arrays;

public class Sum_Highest_and_Lowest_Frequency {
    public int sumHighestAndLowestFrequency(int[] nums) {

        Arrays.sort(nums);

        int length = nums.length;
        int newLength = nums[length - 1];

        int[] hashing = new int[newLength + 1];

        for (int num : nums) {
            hashing[num]++;
        }

        int highFreq = Integer.MIN_VALUE, lowFreq = Integer.MAX_VALUE;

        for (int i = 0; i <= newLength; i++) {
            if (hashing[i] > 0) {
                if (hashing[i] > highFreq) {
                    highFreq = hashing[i];
                }
                if (hashing[i] < lowFreq) {
                    lowFreq = hashing[i];
                }
            }
        }

        return lowFreq + highFreq;
    }
}
