public class LC_1528 {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

    public static void main(String[] args) {
        LC_1528 lc = new LC_1528();
        String example1 = "codeleet";
        int[] example2 = {4,5,6,7,0,2,1,3};

        String result = lc.restoreString(example1, example2);
        System.out.print("Result: " + result);
    }
}
