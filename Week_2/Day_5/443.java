class Solution {
    public int compress(char[] chars) {

        int index = 0; // position to write
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index] = current;
            index++;

            if (count > 1) {
                String num = String.valueOf(count);

                for (int j = 0; j < num.length(); j++) {
                    chars[index] = num.charAt(j);
                    index++;
                }
            }
        }

        return index;
    }
}