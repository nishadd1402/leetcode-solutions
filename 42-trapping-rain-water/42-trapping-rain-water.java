class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int currentWater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    currentWater = maxLeft - height[left];
                    if (currentWater >= 0) {
                        totalWater = totalWater + currentWater;
                    }
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    currentWater = maxRight - height[right];

                    if (currentWater >= 0) {
                        totalWater = totalWater + currentWater;
                    }
                }
                right--;
            }
        }

        return totalWater;
        
    }
    
    /*
    public int trapNonOptimized(int[] height) {
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            int cH = height[i];
            int maxLeft = 0;
            int maxRight = 0;
            int left = i;
            int right = i;
            int currentWater = 0;

            while (left >= 0) {
                maxLeft = Math.max(maxLeft, height[left]);
                left--;
            }

            while (right < height.length) {
                maxRight = Math.max(maxRight, height[right]);
                right++;
            }

            currentWater = Math.min(maxLeft, maxRight) - cH;

            if(currentWater >= 0){
                totalWater = totalWater + currentWater;
            }
        }

        return totalWater;
    } */
}