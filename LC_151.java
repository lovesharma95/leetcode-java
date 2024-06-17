
public class LC_151 {

    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder res= new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
            if(words[i]!="") {
                res.append(words[i]);
                if(i!=0) {
                    res.append(" ");
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LC_151 lc = new LC_151();

        System.out.println("Result: ");
        System.out.println(lc.reverseWords("the sky is blue"));
    }
}
