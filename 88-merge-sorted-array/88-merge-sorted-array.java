class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] output = new int[m + n];

        while (i < m && j < n){
            if(nums1[i] <= nums2[j]){
                output[index++] = nums1[i++];
            } else {
                output[index++] = nums2[j++];
            }
        }

        while (i<m){
            output[index++] = nums1[i++];
        }

        while (j<n){
            output[index++] = nums2[j++];
        }

        for (int k = 0; k< nums1.length; k++) {
            nums1[k] = output[k];
        }
    }
}