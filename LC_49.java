import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        LC_49 lc = new LC_49();
        String[] example1 = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = lc.groupAnagrams(example1);
        System.out.print("Result: " + result);
    }
}
