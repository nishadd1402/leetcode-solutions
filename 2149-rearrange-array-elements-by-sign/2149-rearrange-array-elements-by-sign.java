/*class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 0;
        int index = 0;
        int l = nums.length;
        int[] result = new int[l];

        while (index < l) {
            if(nums[index] > 0){
                i = index;
                break;
            } else {
                i++;
                index++;
            }
        }

        index = 0;

        while (index < l) {
            if(nums[index] < 0){
                j = index;
                break;
            } else {
                j++;
                index++;
            }
        }

        index = 0;

        //{3,1,-2,-5,2,-4};

        while (index < l) {

            if(nums[i] >= 0 ) {
                result[index++] = nums[i++];

                while (i<l) {
                    if(nums[i] >= 0){
                        break;
                    }
                    i++;
                }
            }

            if(nums[j] < 0){
                result[index++] = nums[j++];

                while (j<l) {
                    if(nums[j] < 0){
                        break;
                    }
                    j++;
                }
            }
        }

        return result;
    }
}
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        
        int evenIndex = 0;
        int oddIndex = 1;
        
        for(int i = 0; i < l ; i++) {
            
            if(nums[i]>0) {
                result[evenIndex] = nums[i];
                evenIndex = evenIndex + 2;
            } else {
                result[oddIndex] = nums[i];
                oddIndex = oddIndex + 2;
            }
          
        }
        
        return result;       
    }
}    
