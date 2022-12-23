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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        String str="";
        while(curr!=null)
        {
            str=str+curr.val;
            curr=curr.next;
        }
        int decimal=Integer.parseInt(str,2);
        return decimal;
    }
}