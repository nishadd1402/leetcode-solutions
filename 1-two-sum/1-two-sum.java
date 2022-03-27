class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0 ; i<nums.length; i++) {
            int ntf = target - nums[i];
            
            if(!map.containsKey(nums[i])) {
                map.put(ntf, i);
            } else{
                int[] result = {map.get(nums[i]), i};
                return result;
            }
            
        }
        return null;
    }
}