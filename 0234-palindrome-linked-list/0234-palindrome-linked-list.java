class Solution {
    public boolean isPalindrome(ListNode head) {

        List<Integer> l = new ArrayList<>();

        ListNode h1 = head;

        // Convert linked list to array
        while (h1 != null) {
            l.add(h1.val);
            h1 = h1.next;
        }

        return isPal(l);
    }

    public static boolean isPal(List<Integer> l) {

        int start = 0, end = l.size() - 1;

        while (start < end) {
            if (!l.get(start).equals(l.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}