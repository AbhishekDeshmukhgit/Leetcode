/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1=headA;
        ListNode d2=headB;
        int l1=0;
        int l2=0;
        while(d1!=null)
        {
            l1++;
            d1=d1.next;
        }
        
        while(d2!=null)
        {
            l2++;
            d2=d2.next;
        }
        if(l1>l2)
        {
            int d=l1-l2;
            d1=headA;
            d2=headB;
            for(int i=0;i<d;i++)
            {
                d1=d1.next;
            }
        }else{
            int d=l2-l1;
            d1=headA;
            d2=headB;
            for(int i=0;i<d;i++)
            {
                d2=d2.next;
            }
        }
        while(d1!=null && d2!=null)
        {
            if(d1==d2)
            {
                return d1;
            }
            d1=d1.next;
            d2=d2.next;
        }
        return null;
    }
}