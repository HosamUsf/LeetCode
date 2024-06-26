class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen == 0) {
            return 0;
        }

        if (hayLen < needleLen) {
            return -1;
        }

        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == needleLen) {
                    return i;
                }
            }
        }

        return -1;
    }
}
