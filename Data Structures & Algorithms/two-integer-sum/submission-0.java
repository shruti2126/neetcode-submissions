class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                int compIndex = map.get(comp);
                if(compIndex < i){
                    output[0] = compIndex;
                    output[1] = i;
                } else {
                    output[1] = compIndex;
                    output[0] = i;
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return output;
    }
}
