// Last updated: 27/04/2026, 04:06:13
class Solution {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        // step 1: find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // break list
        prev.next = null;

        // step 2: sort both halves
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3: merge
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
    }
}