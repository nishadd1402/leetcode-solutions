class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = sArr.length - 1; i >= 0; i--) {
            if("".equals(sArr[i])){
                continue;
            }
            sb.append(sArr[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }
        return String.join(" ", sb.toString());
    }
}