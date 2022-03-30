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

/*
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i != j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                j++;
            }
        }

        return nums;
    }
}*/