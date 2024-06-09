public class LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        LC_88 lc = new LC_88();
        int[] example1 = {1,2,3,0,0,0};
        int[] example2 = {2,5,6};

        lc.merge(example1, 3, example2, 3);
    }
}
