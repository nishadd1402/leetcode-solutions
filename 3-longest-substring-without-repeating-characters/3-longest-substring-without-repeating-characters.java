class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1){
            return s.length();
        }
        int largest = 0;
        String[] strArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < strArr.length; right++) {
            String curr = strArr[right];
            Integer index = map.get(curr);
            if (index != null && index >= left) {
                left = index + 1;
            }
            map.put(curr, right);
            largest = Math.max(largest, right - left + 1);
        }

        return largest;
    }
    
    
    /*
    public int lengthOfLongestSubstringNonOpt(String s) {
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
    }*/
}