// Last updated: 27/04/2026, 04:06:06
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
    public ListNode reverseList(ListNode head) {

        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode nextnode=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=nextnode;
            if(nextnode!=null){
                nextnode=nextnode.next;
            }
        }
        return prev;
    }
}