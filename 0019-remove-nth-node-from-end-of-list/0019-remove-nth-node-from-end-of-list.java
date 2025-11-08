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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       ListNode prev=null;
       int count=0;
       if (head == null) return null;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       int res = count-n;
       if(res==0){
        return head.next;
       }
       temp=head;
       for(int i=1;i<res;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
}