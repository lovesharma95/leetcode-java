public class LC_26 {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        LC_26 lc = new LC_26();
        int[] example1 = {1,1,2};

        System.out.println("Result: " + lc.removeDuplicates(example1));
    }
}
