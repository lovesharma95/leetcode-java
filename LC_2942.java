import java.util.ArrayList;
import java.util.List;

public class LC_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;   
    }

    public static void main(String[] args) {
        LC_2942 lc = new LC_2942();
        String[] example1 = {"abc","bcd","aaaa","cbc"};

        List<Integer> result = lc.findWordsContaining(example1, 'a');
        System.out.print("Result: " + result);
    }
}
