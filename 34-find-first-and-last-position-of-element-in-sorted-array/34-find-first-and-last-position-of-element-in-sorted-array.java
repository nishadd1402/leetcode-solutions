class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;

        int firstPos = binarySearch(left, right, nums, target);

        if (firstPos == -1) {
            return new int[]{-1, -1};
        }

        int startPosition = firstPos;
        int endPosition = firstPos;
        int tmpLeft = -1;
        int tmpRight = -1;

        //binarySearch in left subArray
        while (startPosition != -1) {
            tmpLeft = startPosition;
            startPosition = binarySearch(left, startPosition - 1, nums, target);
        }
        startPosition = tmpLeft;


        //binarySearch in right subArray
        while (endPosition != -1) {
            tmpRight = endPosition;
            endPosition = binarySearch(endPosition + 1, right, nums, target);
        }
        endPosition = tmpRight;

        return new int[]{startPosition, endPosition};
    }

    private int binarySearch(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int mid = (int) Math.floor((left + right) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }
        }

        return -1;
    }
}