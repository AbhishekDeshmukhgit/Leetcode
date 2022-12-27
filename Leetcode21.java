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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        ListNode a=list1;
        ListNode b=list2;
        ListNode head;
        ListNode tail;
        if(a.val<=b.val)
        {
             head=a;
             tail=a;
            a=a.next;
        }else{
             head=b;
             tail=b;
            b=b.next;
        }
        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null)
        {
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return head;

    }
}