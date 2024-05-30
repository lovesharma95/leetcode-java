import java.util.HashSet;
import java.util.Set;

class LC_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] strArr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str : words){
            StringBuffer sb = new StringBuffer();
            for(char ch : str.toCharArray()){
                sb.append(strArr[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        LC_804 lc = new LC_804();
        String[] example1 = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};

        int result = lc.uniqueMorseRepresentations(example1);
        System.out.print("Result: " + result);
    }
}