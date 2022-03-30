class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        int j = 0;
        int index = 0;

        while (index < n) {

            while (i < n) {
                if (nums[i] % 2 == 0) {
                    result[index++] = nums[i];
                }
                i++;
            }

            while (j < n) {
                if (nums[j] % 2 != 0) {
                    result[index++] = nums[j];
                }
                j++;
            }
        }

        return result;
    }
}