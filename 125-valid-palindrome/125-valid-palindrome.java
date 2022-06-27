class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        
        String[] strArr = s.split("");
        int left = 0; int right = strArr.length - 1;

        while (left <= right){
            if(!strArr[left].equals(strArr[right])) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
        
    }
}