public class LC_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence: sentences) {
            if(sentence.split(" ").length > max) {
                max = sentence.split(" ").length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LC_2114 lc = new LC_2114();
        String[] example1 = {"alice and bob love leetcode","i think so too","this is great thanks very much"};

        int result = lc.mostWordsFound(example1);
        System.out.print("Result: " + result);
    }
}
