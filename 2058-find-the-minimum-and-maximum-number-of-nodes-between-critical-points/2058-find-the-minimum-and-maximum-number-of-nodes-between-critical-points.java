class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int last = -1;
        int first = -1;
        int min = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;

        while (curr != null && curr.next != null) {

            boolean maxima =
                curr.val > prev.val &&
                curr.val > curr.next.val;

            boolean minima =
                curr.val < prev.val &&
                curr.val < curr.next.val;

            if (minima || maxima) {

                if (first == -1) {
                    first = index;
                } else {
                    min = Math.min(min, index - last);
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (first == -1 || first == last) {
            return new int[] {-1, -1};
        }

        int max = last - first;

        return new int[] {min, max};
    }
}