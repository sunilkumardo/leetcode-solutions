class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int numsum=0;
        int incsum=0;
        int result=0;
        for(int i=0;i<n;i++){
            numsum +=nums[i];
            incsum +=i;

        }
        incsum +=n;
        result=incsum - numsum;
        return result;
    }
}