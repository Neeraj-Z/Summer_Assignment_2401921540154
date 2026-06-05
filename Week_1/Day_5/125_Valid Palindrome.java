class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned = cleaned + ch;
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {

            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}