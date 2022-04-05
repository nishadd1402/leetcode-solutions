class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curr = Math.abs(nums[i]);
            nums[curr - 1] = -1 * Math.abs(nums[curr - 1]);
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] > 0){
                result.add(i+1);
            }
        }

        return result;
    }
}