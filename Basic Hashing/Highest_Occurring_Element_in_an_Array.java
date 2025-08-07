import java.util.Arrays;

public class Highest_Occurring_Element_in_an_Array {
    public int mostFrequentElement(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        int newLength = nums[length-1];

        int[] hashArray = new int[newLength + 1];
        
        for (int num : nums){ 
            hashArray[num]++; 
        }

        int maxFreq = 0;
        int maxEle = Integer.MAX_VALUE;

        for(int i = 0; i <= newLength; i++){
           if(hashArray[i] > maxFreq){
                maxFreq = hashArray[i];
                maxEle = i;
           }else if (hashArray[i] == maxFreq && i < maxEle) {
                maxEle = i;
            }
        }

        return maxEle;
    }
}
