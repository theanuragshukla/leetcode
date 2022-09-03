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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
      if(A == null) return B;
        if(B == null) return A;
          
        if(A.val < B.val) 
        {
            A.next = mergeTwoLists(A.next, B);
            return A;
        }
        else 
        {
            B.next = mergeTwoLists(A, B.next);
            return B;
        }
            
    }
}