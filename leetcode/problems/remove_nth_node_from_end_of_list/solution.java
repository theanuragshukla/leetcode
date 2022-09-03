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
        int len=0;
        ListNode x = head;
        while(x!=null){
            x=x.next;
            len++;
        }
        x=head;
        ListNode l1 = x;
        for(int i =0; i<len;i++){
            if(len-n-1==-1){
                return head.next;
            }
            if(i==len-n-1){
                if(x.next.next!=null)
               x.next = x.next.next;
                else
                x.next=null;
                return head;
            }
            x=x.next;
        }
        return head;
    }
}