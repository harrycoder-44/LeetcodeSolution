/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode h1 = head;
        List<Integer> list = new ArrayList<>();

        while(h1 != null){
            list.add(h1.val);
            h1 = h1.next;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int num : list){
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;

        

    }
}