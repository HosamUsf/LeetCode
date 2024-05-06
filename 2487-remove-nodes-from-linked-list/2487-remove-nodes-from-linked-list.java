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
    public ListNode removeNodes(ListNode head) {
        ListNode current = head; 
        Stack<ListNode> stack = new Stack<>();

        while(current != null){
            while(!stack.isEmpty() && stack.peek().val < current.val){
                stack.pop();
            }
            stack.push(current);
            current = current.next;
        }
        ListNode next = null;

        while(!stack.isEmpty()){
            current = stack.pop();
            current.next = next;
            next = current;
        }

        return current;
    }
}