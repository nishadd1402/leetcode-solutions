class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if(stack.size() > 0){
                char leftBracket = stack.pop();
                char validBracket = map.get(leftBracket);
                if (validBracket != curr) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}