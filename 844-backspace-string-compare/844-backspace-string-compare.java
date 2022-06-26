class Solution {
    public boolean backspaceCompare(String s, String t) {
        Solution l = new Solution();
        List<Character> sFinal = l.finalString(s);
        List<Character> tFinal = l.finalString(t);

        if (sFinal.size() != tFinal.size()) {
            return false;
        }

        for(int i = 0; i< sFinal.size() ; i++){
            if(sFinal.get(i) != tFinal.get(i)) {
                return false;
            }
        }

        return true;
    }
    
    private List<Character> finalString(String s){
        List<Character> strChars = new ArrayList<>();

        for(int i = 0; i< s.length() ; i++){
            if(s.charAt(i) == '#') {
                if(strChars.size() > 0){
                    strChars.remove(strChars.size() -1);
                }
            } else {
                strChars.add(s.charAt(i));
            }
        }

        return strChars;
    }
}