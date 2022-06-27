class Solution {
   
    public boolean validPalindrome(String str) {
      //  str = str.replaceAll("[^a-zA-Z0-9]", "");
        String[] strArr = str.split("");
        int left = 0;
        int right = strArr.length-1;
        //adepaeda
        while (left <= right) {
            if(!strArr[left].equals(strArr[right])) {
                return almostAPalindrome(strArr, left+1, right) || almostAPalindrome(strArr, left, right-1);
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean almostAPalindrome(String[] arr, int left, int right){
        while (left<=right) {
            if (!arr[left].equals(arr[right])){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}