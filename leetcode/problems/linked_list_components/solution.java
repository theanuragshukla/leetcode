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
    public int numComponents(ListNode head, int[] nums) {
        HashMap<Integer, Integer> m= new HashMap<>();
       ListNode temp = head;
       int i = 0;
       while(temp!=null){
           m.put(temp.val, i++);
           temp=temp.next;
       } 
       int[] arr = new int[m.size()];
       for(i = 0; i<arr.length; i++){
           arr[i]=-1;
       }
       for(int p:nums){
           arr[m.get(p)] = p;
       }
int groupCount = 0;
int currentGroupSize = 0;

for (i = 0; i < arr.length; i++) {
    if (arr[i] >= 0) {
        currentGroupSize++;
    } else {
        if (currentGroupSize > 0) {
            groupCount++;
            currentGroupSize = 0;
        }
    }
}

if (currentGroupSize > 0) {
    groupCount++;
}

return groupCount;
    }
}