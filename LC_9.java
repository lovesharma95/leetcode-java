class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int leftPointer = 0;
        int rightPointer = str.length() - 1;
        while(leftPointer < rightPointer) {
            if(str.charAt(leftPointer) != str.charAt(rightPointer)) {
                return false;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        return true;
    }
}

class LC_9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(121);
        System.out.println("IsPalindrom: " + result);
    }
}