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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        ListNode prev=null;
        while(head.next!=null){
            //curr=head.next;
               ListNode temp=head.next;
     
            head.next=prev;
            prev=head;
            head=temp;
        }
        head.next=prev;
        return head;
    }
}