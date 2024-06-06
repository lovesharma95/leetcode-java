public class LC_28 {
    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLength = needle.length();
        for( int i = 0 ; i <= hayLength -  needleLength; i++) {
            if(haystack.substring(i, needleLength + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LC_28 lc = new LC_28();
        String example1 = "hello";
        String example2 = "ll";

        System.out.println("Result: " + lc.strStr(example1, example2));
    }
}
