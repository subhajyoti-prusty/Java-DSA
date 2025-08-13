import java.util.Arrays;

class Second_Highest_Occurring_Element {
    public int secondMostFrequentElement(int[] nums) {

        Arrays.sort(nums);

        int length = nums.length;
        int newlength = nums[length - 1];

        int[] hashing = new int[newlength + 1];

        for(int num : nums){
            hashing[num]++;
        }

        int freq1 = 0, freq2 = 0;
        int maxEle1 = -1, maxEle2 = -1;

        for(int i = 0; i <= newlength; i++){
            if(hashing[i] > freq1){
                freq2 = freq1;
                maxEle2 = maxEle1;

                freq1 = hashing[i];
                maxEle1 = i;
            }else if(hashing[i] < freq1 && hashing[i] > freq2){
                freq2 = hashing[i];
                maxEle2 = i;
            }else if(hashing[i] == freq2 && i < maxEle2){
                maxEle2 = i;
            }
        }

        if(maxEle2 == -1){
            return -1;
        }

        return maxEle2;
    }
}

