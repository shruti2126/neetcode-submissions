class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numCount = new HashSet<>();
        for(int n : nums) {
            if(numCount.contains(n)) {
                //we have already seen this
                 return true;
            }
            numCount.add(n);
        }
        return false;
    }
}
