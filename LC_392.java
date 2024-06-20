
public class LC_392 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) {
                    return true;
                }
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LC_392 lc = new LC_392();
        String example1 = "abc";
        String example2 = "ahbgdc";

        boolean result = lc.isSubsequence(example1, example2);
        System.out.print("Result: " + result);
    }
}
