class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                int numRepeats = len / i;
                String builtString = "";
                for (int j = 0; j < numRepeats; j++) {
                    builtString += sub; 
                }
                if (builtString.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}