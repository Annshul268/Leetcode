class Solution {
    public int compress(char[] chars) {
        char prevch = chars[0];

        int count = 0;
        int write = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (prevch == ch) {
                count++;
            } else {
                chars[write] = prevch;
                write++;
                if (count > 1) {
                    String num = String.valueOf(count);
                    for (int j = 0; j < num.length(); j++) {
                        chars[write] = num.charAt(j);
                        write++;
                    }
                }
                prevch = ch;
                count = 1;
            }
        }

        chars[write] = prevch;
        write++;
        if (count > 1) {
            String num = String.valueOf(count);
            for (int j = 0; j < num.length(); j++) {
                chars[write] = num.charAt(j);
                write++;
            }
        }

        return write;
    }
}