
class LC_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left); // height * width
            maxArea = Math.max(maxArea, currentArea);
                
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        LC_11 lc = new LC_11();
        int[] example1 = {1,8,6,2,5,4,8,3,7};

        System.out.println("Result: " + lc.maxArea(example1));
    }
}