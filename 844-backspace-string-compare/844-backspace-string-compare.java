class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0) {
            if ((i >= 0 && s.charAt(i) == '#') || (j >= 0 && t.charAt(j) == '#')) {
                if (i >= 0 && s.charAt(i) == '#') { 
                    int backCount = 2;

                    while (backCount > 0) {
                        i--;
                        backCount--;
                        if (i >= 0 && s.charAt(i) == '#') {
                            backCount = backCount + 2;
                        }
                    }
                }

                if (j >= 0 && t.charAt(j) == '#') {
                    int backCount = 2;

                    while (backCount > 0) {
                        j--;
                        backCount--;
                        if (j >= 0 && t.charAt(j) == '#') {
                            backCount = backCount + 2;
                        }
                    }
                }

            } else {
                if ((i < 0 || j < 0) || (s.charAt(i) != t.charAt(j))) {
                    return false;
                } else {
                    i--;
                    j--;
                }
            }
        }

        return true;

    }
    
    /*
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
    }*/
}