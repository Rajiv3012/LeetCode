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
    public ListNode sortList(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            nums.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(nums);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.val=nums.get(i);
            temp=temp.next;
            i=i+1;
        }
        return head;

    }
}