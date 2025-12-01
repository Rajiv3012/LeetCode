class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevgroup = dummy;

        while (true) {

            ListNode check = prevgroup;
            for (int i = 0; i < k && check != null; i++) {
                check = check.next;
            }

            if (check == null) break;

            ListNode groupstart = prevgroup.next;
            ListNode nextgroupstart = check.next;

            check.next = null;

            ListNode newhead = reverse(groupstart);

            prevgroup.next = newhead;
            groupstart.next = nextgroupstart;

            prevgroup = groupstart;
        }

        return dummy.next;
    }


    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}


public class Main {

    public static void main(String[] args) {

        // Create LinkedList: 1 → 2 → 3 → 4 → 5 → 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        int k = 3;

        Solution sol = new Solution();
        ListNode newHead = sol.reverseKGroup(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        printList(newHead);
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

