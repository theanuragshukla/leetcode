/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<ListNode>();
        int sz=0;
        while(head!=null){
            sz=s.size();
            s.add(head);
            if(s.size()==sz)return true;
            head=head.next;
        }
        return false;
    }
}