public class LC_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set= new boolean[26];
        for(int i=0;i<allowed.length();i++){
            set[allowed.charAt(i)-'a']=true;
        }
        int count=0;
        for(String w:words){
            if(solve(w,set)) count++;
        }
        return count;
    }
    public static boolean solve(String w,boolean[] set){
        for(int j=0;j<w.length();j++){
            if(set[w.charAt(j)-'a']==false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC_1684 lc = new LC_1684();
        String[] example1 = {"ad", "bd", "aaab", "baa", "badab"};

        int result = lc.countConsistentStrings("ab", example1);
        System.out.print("Result: " + result);
    }
}
