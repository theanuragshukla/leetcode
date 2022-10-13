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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr = head;        
        ListNode prev = null;
        ListNode ret = head.next;
        
        while(curr!=null){
            if(curr.next==null)break;
            ListNode temp = null;
            if(curr.next!=null){
                temp=curr.next.next;
            }
            ListNode l1 = curr;
            curr= curr.next;
            curr.next=l1;
            l1.next=temp;
         
            if(prev==null){
                prev=l1;
            }else{
                prev.next=curr;
                prev=l1;
            }
         curr=temp;
        }
        
        return ret;
    }
}