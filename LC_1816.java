public class LC_1816 {
    public String truncateSentence(String s, int k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')    count++;
            if(count == k)    return s.substring(0, i);
        }
        return s;
    }

    public static void main(String[] args) {
        LC_1816 lc = new LC_1816();
        String example1 = "Hello how are you Contestant";

        String result = lc.truncateSentence(example1, 4);
        System.out.print("Result: " + result);
    }
}
