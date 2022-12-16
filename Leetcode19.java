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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        if(head.next==null)
        {
            return null;
        }
        ListNode start = new ListNode(0);
        ListNode first=start;
        ListNode second=start;
        second.next=head;
        for(int i=0;i<n+1;i++)
        {
            first=first.next;
        }
        while(first !=null)
        {
         
            second=second.next;
            first=first.next;
        }
        second.next=second.next.next;
        return start.next;
    }
}