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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail = head;
        int count=1;
        while(tail.next!=null){
            tail=tail.next;
            count++;
        }
        int position =k%count;
        if(position==0)return head;
        ListNode temp= head;
        for(int i=0;i<count-position-1;i++){
            temp=temp.next;
        }
        ListNode newhead = temp.next;
        temp.next=null;
        tail.next=head;
        return newhead;
    }
}