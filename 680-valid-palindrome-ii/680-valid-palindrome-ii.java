class Solution {
    public boolean validPalindrome(String str) {
       //tr = str.replaceAll("[^a-zA-Z0-9]", "");

        String[] strArr = str.toLowerCase().split("");

        int left = 0;
        int right = strArr.length - 1;

        while (left < right) {
            if (!strArr[left].equals(strArr[right])) {
                return isAlmostPalindrome(strArr, left + 1, right) || isAlmostPalindrome(strArr, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlmostPalindrome(String[] strArr, int left, int right) {
        while (left < right) {
            if (!strArr[left].equals(strArr[right])) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}