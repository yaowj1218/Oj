public class strStr {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    //考虑多种情况。。。fan
    public int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }
        if (target.length() == 0) {
            return 0;
        }
        int i=0,j=0;
        while (i<source.length()){
            if(source.charAt(i)==target.charAt(j)){
                i++;j++;
            }else {
                if (j == 0){
                    i++;
                }j=0;
            }
            if (j == target.length()) {
                return i - j;
            }
        }

        return -1;
    }
}
