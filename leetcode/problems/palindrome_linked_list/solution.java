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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int n = 0;
        Stack<Integer> st = new Stack<Integer>();
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n%2==0){
            int p = 0;
            while(p<(n/2)){
                p++;
                st.push(head.val);
                head=head.next;
            }
       //       System.out.println(st);
      
            while(!st.isEmpty()){
      //              System.out.println(st);
      
                if(head.val!=st.pop()){
                     //   System.out.println(st);
                    return false;
                }
                   head=head.next;
   
            }
       //         System.out.println(st);
      
            return true;
        }else{
              int p = 0;
            while(p<((n-1)/2)){
                p++;
                st.push(head.val);
                head=head.next;
            }
            head=head.next;
            while(!st.isEmpty()){
                if(head.val!=st.pop()){
                    return false;
                }
                   head=head.next;
   
            }
            return true;
        }
        
    }
}