public class LC_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "", secondWord = "";
        for(String w1: word1) {
            firstWord += w1;
        }
        for(String w2: word2) {
            secondWord += w2;
        }
        return firstWord.equals(secondWord);
    }

    public static void main(String[] args) {
        LC_1662 lc = new LC_1662();
        String[] example1 = {"a", "bc"};
        String[] example2 = {"ab", "c"};

        boolean result = lc.arrayStringsAreEqual(example1, example2);
        System.out.print("Result: " + result);
    }
}
