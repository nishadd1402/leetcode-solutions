class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] strArr = s.split("");
        int largest = 0;

        for (int i = 0; i < s.length(); i++) {
            Map<String, String> map = new HashMap<>();
            for (int j = i; j < strArr.length; j++) {
                String curr = strArr[j];
                if(!map.containsKey(curr)){
                    map.put(curr, null);
                    largest = Math.max(largest, map.size());
                } else {
                    break;
                }
            }
        }

        return largest;
    }
}