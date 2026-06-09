import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }

        for (int i = p.length(); ; i++) {
            if (Arrays.equals(a, b))
                ans.add(i - p.length());

            if (i == s.length()) break;

            b[s.charAt(i) - 'a']++;
            b[s.charAt(i - p.length()) - 'a']--;
        }

        return ans;
    }
}