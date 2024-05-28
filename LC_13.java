import java.util.HashMap;

class LC_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            int currentVal = romanMap.get(s.charAt(i));
            int nextVal = (i < length - 1) ? romanMap.get(s.charAt(i + 1)) : 0;
            
            if (currentVal < nextVal) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LC_13 lc = new LC_13();

        System.out.println("Result: " + lc.romanToInt("IV"));
    }
}