class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode h1 = head;

        List<Integer> list = new ArrayList<>();

        while(h1 != null){
            list.add(h1.val);
            h1 = h1.next; 
        }

        for(int i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j)); 
                    list.set(j, temp);       
                }
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int num : list){
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}