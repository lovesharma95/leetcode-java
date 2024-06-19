
public class LC_125 {

    public boolean isPalindrome(String s) {
        String lowercaseString = s.toLowerCase();
        int i = 0;
        int j = lowercaseString.length() - 1;
        while (i < j) {
            char a = lowercaseString.charAt(i);
            char b = lowercaseString.charAt(j);
            if (!Character.isLetterOrDigit(a)) {
                i++;
            } else if (!Character.isLetterOrDigit(b)) {
                j--;
            } else {
                if (a != b) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LC_125 lc = new LC_125();

        System.out.println("Result: ");
        System.out.println(lc.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
