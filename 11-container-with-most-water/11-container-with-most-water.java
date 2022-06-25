class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int l = Math.min(height[left], height[right]);
            int w = right - left;
            int a = l * w;
            maxArea = Math.max(maxArea, a);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
    }
   
    /*public int maxAreaNonOptimized(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int l = Math.min(height[i], height[j]);
                int w = j - i;
                int a = l * w;
                maxArea = Math.max(maxArea, a);
            }
        }
        return maxArea;
    }*/
}