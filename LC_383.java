
import java.util.HashMap;

public class LC_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        LC_383 lc = new LC_383();
        String example1 = "aa";
        String example2 = "aab";

        boolean result = lc.canConstruct(example1, example2);
        System.out.print("Result: " + result);
    }
}
