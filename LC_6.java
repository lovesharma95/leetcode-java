
public class LC_6 {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            rows[index].append(s.charAt(i));
            if (index == 0 || index == numRows - 1) {
                goingDown = !goingDown;
            }
            index += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LC_6 lc = new LC_6();
        String example1 = "PAYPALISHIRING";

        System.out.println("Result: " + lc.convert(example1, 3));
    }
}
