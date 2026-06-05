class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result = "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            boolean same = true;

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    same = false;
                    break;
                }

                if (strs[j].charAt(i) != ch) {
                    same = false;
                    break;
                }
            }

            if (same == true) {
                result = result + ch;
            } else {
                break;
            }
        }

        return result;
    }
}