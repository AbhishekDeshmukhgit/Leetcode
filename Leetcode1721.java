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
    public ListNode swapNodes(ListNode head, int k) {
        int temp1=k;
        ListNode curr1=head;
        while(temp1>1)
        {
            curr1=curr1.next;
            temp1--;
        }
        ListNode curr2=head;
        int count=1;
        while(curr2.next!=null)
        {
            curr2=curr2.next;
            count++;
        }
        System.out.println(count);
        int j=count-k+1;
        System.out.println(j);
        ListNode curr3=head;
        while(j>1)
        {
            curr3=curr3.next;
            j--;
        }
        int val1=curr1.val;
        curr1.val=curr3.val;
        curr3.val=val1;
        return head;
        
    }
}