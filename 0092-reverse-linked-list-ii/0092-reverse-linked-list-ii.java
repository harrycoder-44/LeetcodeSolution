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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftNode = dummy;
        ListNode curr = head;

        for(int i=0; i<left-1; i++){
            leftNode = leftNode.next;
            curr = curr.next;
        }

        ListNode sublistcurr = curr;


        ListNode preNode = null;
        for(int i=0; i<=right - left; i++){

            ListNode nextNode = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = nextNode;

        }


        leftNode.next = preNode;
        sublistcurr.next = curr;


        return dummy.next; 

        
        
    }
}