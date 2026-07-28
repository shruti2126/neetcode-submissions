class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int prd = 1;
        for(int i = 0; i < nums.length; i++){
            prd *= nums[i];
            prefix[i] = prd;
        }
        
        prd = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            prd *= nums[i];
            suffix[i] = prd;
        }
     
        int i = 0; 
        while(i < nums.length) {
            if(i == 0) {
                output[i] = suffix[i + 1];
            } else if(i == nums.length - 1) {
                output[i] = prefix[i - 1];
            } else {
                output[i] = prefix[i-1] * suffix[i + 1];
            }
            i++;
        }

        return output;
        
    }
}  
