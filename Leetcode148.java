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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
        int i=0;
        curr=head;
        while(curr !=null)
        {
            curr.val=arr[i];
            i++;
            curr=curr.next;
        }
        return head;
    }
}