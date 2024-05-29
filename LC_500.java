import java.util.ArrayList;
import java.util.HashMap;

class LC_500 {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        // Create a HashMap to map each character to its corresponding row index
        HashMap<Character, Integer> charToRowMap = new HashMap<>();
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                charToRowMap.put(c, i);
            }
        }

        ArrayList<String> res = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            int firstCharRow = charToRowMap.get(lowerWord.charAt(0));
            boolean isValid = true;
            
            for (char c : lowerWord.toCharArray()) {
                if (charToRowMap.get(c) != firstCharRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                res.add(word);
            }
        }

        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        LC_500 lc = new LC_500();
        String[] example1 = {"Hello","Alaska","Dad","Peace"};

        String[] result = lc.findWords(example1);
        System.out.print("Result: ");
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}