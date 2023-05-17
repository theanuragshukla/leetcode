/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func pairSum(head *ListNode) int {
 	arr := make([]int, 0)
	for tmp := head; tmp != nil; tmp = tmp.Next {
		arr = append(arr, tmp.Val)
	}
    sum := 0
	for i:= 0; i<len(arr)/2; i++{
        curr:=arr[i]+arr[len(arr)-1-i]
        if curr > sum {
            sum = curr
        }
    }
	return sum


}