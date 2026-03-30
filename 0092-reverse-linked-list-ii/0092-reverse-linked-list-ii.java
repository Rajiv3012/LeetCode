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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode beforeleft= dummy;
        for(int i=1;i<left;i++){
            beforeleft=beforeleft.next;
        }
        ListNode curr = beforeleft.next;//left hai
        ListNode prev= null;
        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        // Step 3: reconnect
        beforeleft.next.next = curr;   // old 'left' node -> node after 'right'
        beforeleft.next = prev;        // beforeLeft -> new head (old 'right')
        return dummy.next;
    }
}