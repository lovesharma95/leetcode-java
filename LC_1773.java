import java.util.Arrays;
import java.util.List;

public class LC_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int subArrayIndex = 0;
        if (ruleKey.equals("color")) {
            subArrayIndex = 1;
        }
        if (ruleKey.equals("name")) {
            subArrayIndex = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(subArrayIndex).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LC_1773 lc = new LC_1773();
        List<List<String>> example1 = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );

        int result = lc.countMatches(example1, "color", "silver");
        System.out.print("Result: " + result);
    }
}
