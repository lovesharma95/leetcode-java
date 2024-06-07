public class LC_58 {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LC_58 lc = new LC_58();
        String example1 = "   fly me   to   the moon  ";

        System.out.println("Result: " + lc.lengthOfLastWord(example1));
    }
}
