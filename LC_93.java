
import java.util.ArrayList;
import java.util.List;

public class LC_93 {

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return new ArrayList<String>();
        }

        List<String> res = new ArrayList<String>();

        helper(0, 0, res, "", s);

        return res;
    }

    private void helper(int i, int dots, List<String> res, String curIp, String s) {
        if (dots == 4 && i == s.length()) {
            res.add(curIp.substring(0, curIp.length() - 1));
            return;
        }

        if (dots > 4) {
            return;
        }

        for (int j = i; j < Math.min(i + 3, s.length()); j++) {
            String subStr = s.substring(i, j + 1);
            if (isValid(subStr)) {
                helper(j + 1, dots + 1, res, curIp + subStr + '.', s);
            }
        }
    }

    private boolean isValid(String subString) {
        if (subString.length() > 1 && subString.charAt(0) == '0') {
            return false;
        }

        int i = Integer.parseInt(subString);
        if (i > 255) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LC_93 lc = new LC_93();
        String example1 = "25525511135";

        System.out.println("Result: " + lc.restoreIpAddresses(example1));
    }
}
