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
    public ListNode detectCycle(ListNode root) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        int i=0;
        while(root!=null){
            if(map.containsKey(root)){
                return root;
            }
            map.put(root, i++);
            root=root.next;
        }
        return null;
    }
}