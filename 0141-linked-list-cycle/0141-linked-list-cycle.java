/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> l = new ArrayList<>();
        ListNode n = head;

        while(n!=null){
            if(l.contains(n)){
                return true;
            }

            l.add(n);
            n = n.next;
        }


        return false;



    

        
    }
}