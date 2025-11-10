/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode temp1= headA,temp2=headB;
//         HashMap<ListNode,Integer> map = new HashMap<>();
//         while(temp1!=null){
//             map.put(temp1,1);
//             temp1=temp1.next;            //brute force solution using extra space
//         }
//         while(temp2!=null){
//             if(map.containsKey(temp2)){
//                 return temp2;
//             }
//             temp2=temp2.next;
//         }
//         return null;
//     }
// }


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        if(headA==null || headB==null){
            return null;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==temp2){
                return temp1;
            }
            if(temp1==null){
                temp1=headB;
            }
            if(temp2==null){
                temp2=headA;
            }
        }
        return temp1;
    }
}