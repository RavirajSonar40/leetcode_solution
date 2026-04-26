// Last updated: 27/04/2026, 04:06:14
class Solution {
     ListNode curr = null;
    public void rec( ListNode head){
        ListNode temp = null;
        if(head == null ){
            return ;
        }
        rec(head.next);
        if(curr == null){ 
            return;
        }
        if(curr == head || curr.next == head){
            head.next = null; 
            curr = null;      
            return;
        }
        temp = curr.next;
        curr.next = head;
        head.next = temp;
        curr = temp;
    }
    public void reorderList(ListNode head) {
        ListNode temp = head;
        curr = head;
        rec(head);
    }
}