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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevgroup= dummy;
        while(true){
        ListNode check = prevgroup;
            for(int i=0;i<k && check!=null ;i++){
                check=check.next;
            }

        if(check==null)
            break;
            ListNode groupstart = prevgroup.next;
            ListNode nextgroupstart = check.next;
             check.next=null;
            ListNode newhead = reverse(groupstart);
            prevgroup.next=newhead;
            groupstart.next = nextgroupstart;
            prevgroup=groupstart;

        }
        return dummy.next;
    }

        private ListNode reverse(ListNode head){
            ListNode prev= null;
            ListNode curr = head;
            while(curr!=null){
                ListNode temp = curr.next;
                curr.next = prev;
                prev=curr;
                curr=temp;
            }

        return prev;
        }
    }
