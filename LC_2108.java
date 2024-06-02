public class LC_2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        LC_2108 lc = new LC_2108();
        String[] example1 = {"abc","car","ada","racecar","cool"};

        String result = lc.firstPalindrome(example1);
        System.out.print("Result: " + result);
    }
}
