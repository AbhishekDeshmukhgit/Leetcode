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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1="";
        String s2="";
        ListNode curr=l1;
        while(curr != null)
        {
            s1=s1+curr.val;
            curr=curr.next;
        }
         curr=l2;
        while(curr != null)
        {
            s2=s2+curr.val;
            curr=curr.next;
        }
        StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();
        input1.append(s1);
        input2.append(s2);
        input1.reverse();
        input2.reverse();
        s1=input1.toString();
        s2=input2.toString();
        String res=addStrings(s1,s2);
        ListNode l3=new ListNode(Integer.parseInt(""+res.charAt(0))); 
        for(int i=1;i<res.length();i++)
        {
             l3=insertBegin(l3,Integer.parseInt(""+res.charAt(i)));
        }
        return l3;
    }
    public ListNode insertBegin(ListNode l3,int val)
    {
        ListNode temp=new ListNode(val);
        temp.next=l3;
        return temp;
    }
     public String addStrings(String num1, String num2) {
      StringBuilder sb = new StringBuilder();
      int carry = 0;
      int i = num1.length() - 1;
      int j = num2.length() - 1;

      while (i > -1 || j > -1) {
          int sum = carry + (i < 0 ? 0 : num1.charAt(i--) - 48);
          sum += j < 0 ? 0 : num2.charAt(j--) - 48;
          sb.append(sum % 10);
          carry = sum / 10;
      }
      return sb.append(carry == 1 ? "1" : "").reverse().toString();
  }
}