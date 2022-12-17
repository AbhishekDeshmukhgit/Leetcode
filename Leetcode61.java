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
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null)
    {
        return null;
    }
     ListNode curr=head;
     ArrayList<Integer> list=new ArrayList<>();
     while(curr!=null)
     {
         list.add(curr.val);
         curr=curr.next;
     }   
     int n=list.size();
     int res[]=new int[list.size()];
      k=k%n;
     for(int i=0;i<n;i++)
     {
         if(i<k)
         {
             res[i]=list.get(n + i - k);
         }
         else{
             res[i]=list.get(i-k);
         }
     }
     curr=head;
     for(int i=0;i<n;i++)
     {
         curr.val=res[i];
         curr=curr.next;
     }
     return head;
    }
}