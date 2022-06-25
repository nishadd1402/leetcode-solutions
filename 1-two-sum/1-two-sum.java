class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int ntf = target - curr;
            if (!checkMap.containsKey(curr)) {
                checkMap.put(ntf, i);
            } else {
                return new int[] {i, checkMap.get(curr)};
            }
        }

        return null;
    }
    
/*    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int ntf = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == ntf) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }*/
}