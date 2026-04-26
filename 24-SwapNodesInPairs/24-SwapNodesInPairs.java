// Last updated: 27/04/2026, 04:06:34
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
    public ListNode swapPairs(ListNode head) {
     if(head == null || head.next==null) return head;

    ListNode initial = head;
    ListNode finalHead = null;
    ListNode lastTail = null;

    while(initial != null){

        ListNode breaknode = initial;
        int count = 0;

        while(count < 1 && breaknode != null){
            breaknode = breaknode.next;
            count++;
        }

        if(breaknode == null){
            if(lastTail != null) lastTail.next = initial;
            break;
        }

        ListNode temp = breaknode.next;

        breaknode.next = null;

        ListNode newHead = reverse(initial);

        if(finalHead == null){
            finalHead = newHead;
        }

        if(lastTail != null){
            lastTail.next = newHead;
        }

        lastTail = initial;
       
        initial = temp;
    }

    return finalHead;
}
    

    static public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=null;

        while(pres!=null){ 
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
        }

        return prev;
    }
}