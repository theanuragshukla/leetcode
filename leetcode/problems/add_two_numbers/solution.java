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
       ListNode head = new ListNode();
        ListNode curr = head;
        int carry = 0;
        ListNode x = l1;
        ListNode y = l2;
        int n1=0, n2=0;
        while(x!=null){
            n1++;
            x=x.next;
        }while(y!=null){
            n2++;
            y=y.next;
        }
        boolean b = n1> n2;
        int limit = n1> n2 ? n2 : n1;
        for(int i = 0; i< limit;i++){
            ListNode l = new ListNode();
            int sum = carry + l1.val + l2.val;
            carry = sum/10;
            int a = sum%10;
            l.val=a;
            curr.next=l;
            curr=curr.next;
            l1=l1.next;
            l2=l2.next;
        }
          ListNode ll = b ? l1: l2;
          
        for(int i = limit;i<(b?n1:n2);i++){
            int sum = ll.val+carry;
            carry = sum/10;
            ListNode l = new ListNode(sum%10);
            curr.next=l;
            curr=curr.next;
            ll=ll.next;
    
        }
        if(carry>0){
            ListNode l = new ListNode(carry);
            curr.next=l;
        }
        return head.next;
    }
}