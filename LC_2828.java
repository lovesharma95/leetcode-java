import java.util.Arrays;
import java.util.List;

public class LC_2828 {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC_2828 lc = new LC_2828();
        List<String> example1 = Arrays.asList("alice","bob","charlie");
        String example2 = "abc";

        boolean result = lc.isAcronym(example1, example2);
        System.out.print("Result: " + result);
    }
}
