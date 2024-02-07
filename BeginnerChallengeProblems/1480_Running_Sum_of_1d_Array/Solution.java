public class Solution {
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int runningTotal = 0;

        for (int i = 0; i < nums.length; i++) {
            runningTotal += nums[i];
            runningSum[i] = runningTotal;
        }

        for (int i = 0; i < runningSum.length; i++) {
            System.out.println(runningSum[i]);
        }
        
        return runningSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }
}