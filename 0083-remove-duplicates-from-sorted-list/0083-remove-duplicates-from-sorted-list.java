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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = head ; 
        while(dummy.next != null ){
            if(dummy.val == dummy.next.val) {
                dummy.next = dummy.next.next;
                
            } else {
                dummy = dummy.next;
            }
        }

        return head;
    }
}