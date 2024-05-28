import java.util.Arrays;

class LC_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        String prefix = "";

        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != last.charAt(i)) {
                break;
            }
            prefix += first.charAt(i);
        }

        return prefix;
    }

    public static void main(String[] args) {
        LC_14 lc = new LC_14();
        String[] example1 = {"flower", "flow", "flight"};

        System.out.println("Result: " + lc.longestCommonPrefix(example1));
    }
}