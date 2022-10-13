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
        if(head==null || head.next==null)return head;
        int n = 0;
        ListNode temp = head;
        ListNode last = null;
        while (temp!=null){
            if(temp.next==null){
                last=temp;
            }
            temp=temp.next;
            n++;
        }
        k%=n;
        temp=head;
        while(n-->k+1){
            temp=temp.next;
        }
        last.next=head;
        ListNode ret = temp.next;
        temp.next=null;
        return ret;
    }
}