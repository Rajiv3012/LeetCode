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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++){
            ListNode cur = lists[i];
            while(cur != null){
            list.add(cur.val);
            cur = cur.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for(int j = 0; j < list.size(); j++){
            cur.next = new ListNode(list.get(j));
            cur = cur.next;
        }
        return dummy.next;
    }
}