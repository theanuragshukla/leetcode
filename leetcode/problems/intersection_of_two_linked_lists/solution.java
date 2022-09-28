/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        HashSet<ListNode> s = new HashSet<ListNode>();
        while(h1!=null){
            s.add(h1);
            h1=h1.next;
        }
        int sz = s.size();
        while(h2!=null){
            sz=s.size();
            s.add(h2);
            if(s.size()==sz){
                return h2;
            }
            h2=h2.next;
        }
        return null;
    }
}