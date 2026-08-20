public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    public static int lengthOfCycle(ListNode head) {
        ListNode temp = head;
        int length = 0;

        do {
            temp = temp.next;
            length++;
        } while (temp != head);

        return length;
    }
}