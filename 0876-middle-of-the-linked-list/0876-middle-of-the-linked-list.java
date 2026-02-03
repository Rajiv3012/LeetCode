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
    public ListNode middleNode(ListNode head) {
        // int count=0;
        // ListNode temp = head;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }
        // temp= head ;// move it back           // this is done by using count
        // for(int i=0;i<count/2;i++){
        //     temp=temp.next;
        // }
        // return temp;




        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){      //turtoise and hare method one runs slow
            fast= fast.next.next;                  // and one runs fast
            slow = slow.next;
        }
        return slow;
    }
}