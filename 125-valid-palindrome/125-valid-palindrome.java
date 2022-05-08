class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String[] strArr = str.toLowerCase().split("");

        int left = 0;
        int right = strArr.length-1;

        while (left<right){
            if(!strArr[left].equals(strArr[right])) {
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }
}