
public class LC_2 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }

    private ListNode helper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
        }
        if (l2 != null) {
            sum += l2.val;
        }

        ListNode result = new ListNode(sum % 10);

        ListNode nextL1 = (l1 != null) ? l1.next : null;
        ListNode nextL2 = (l2 != null) ? l2.next : null;

        result.next = helper(nextL1, nextL2, sum / 10);

        return result;
    }

    public static void main(String[] args) {
        LC_2 lc = new LC_2();

        // Example linked lists:
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode sum = lc.addTwoNumbers(list1, list2);
        System.out.print("summed list: ");
        printList(sum);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
