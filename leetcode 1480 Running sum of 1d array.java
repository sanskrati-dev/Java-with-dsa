class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] runningsum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<=i;j++){
             sum=sum+nums[j];
            }
            runningsum[i]=sum;
            
        }
        return runningsum;
    }
}