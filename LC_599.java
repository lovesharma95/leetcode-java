import java.util.ArrayList;
import java.util.HashMap;

class LC_599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < list1.length; i++) {
            hashmap.put(list1[i], i);
        }

        int leastIndexSum = Integer.MAX_VALUE;
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < list2.length; i++) {
            if(hashmap.containsKey(list2[i])) {
                int indexSum = hashmap.get(list2[i]) + i;
                if(indexSum < leastIndexSum) {
                    leastIndexSum = indexSum;
                    res.clear();
                    res.add(list2[i]);
                } else if(indexSum == leastIndexSum) {
                    res.add(list2[i]);
                }
            }
        }

        
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        LC_599 lc = new LC_599();
        String[] example1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] example2 = {"KFC","Shogun","Burger King"};

        String[] result = lc.findRestaurant(example1, example2);
        System.out.print("Result: ");
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}