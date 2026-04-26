// Last updated: 27/04/2026, 04:05:56
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
    public ListNode oddEvenList(ListNode head) {
       if(head==null ||head.next==null || head.next.next==null) return head;

        ListNode oddpoint=head;
        ListNode evenpoint=head.next;
        ListNode evenhead=head.next;

        while(oddpoint.next!=null && evenpoint.next!=null){
            oddpoint.next=oddpoint.next.next;
            evenpoint.next=evenpoint.next.next;
            oddpoint=oddpoint.next;
            evenpoint=evenpoint.next;

        }
        oddpoint.next = evenhead;
        return head; 
    }
}