
public class LC_2125 {
    public int numberOfBeams(String[] bank) {
        int prevCount = 0;
        int lasers = 0;
        for (int i = 0; i < bank.length; i++) {
            String cams = bank[i];
            int count = 0;
            for(int j = 0; j < cams.length(); j++) {
                count += cams.charAt(j) - '0';
            }
            if (count > 0) {  // 3 0 2 1
                lasers += prevCount * count; // 0  6  8
                prevCount = count; // 3  2  1
            }
        }

        return lasers;
    }

    public static void main(String[] args) {
        LC_2125 lc = new LC_2125();
        String[] example1 = {"011001","000000","010100","001000"};

        int result = lc.numberOfBeams(example1);
        System.out.print("Result: " + result);
    }
}
