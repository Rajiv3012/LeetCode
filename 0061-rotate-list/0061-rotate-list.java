import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // Find length + tail
        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }

        // Reduce k
        int pos = k % count;
        if (pos == 0) return head;

        // Move to new tail
        ListNode temp = head;
        for (int i = 0; i < count - pos - 1; i++) {
            temp = temp.next;
        }

        // Rotate
        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;

        return newHead;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size
        int n = sc.nextInt();

        // Build list
        ListNode head = null, curr = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (head == null) {
                head = new ListNode(x);
                curr = head;
            } else {
                curr.next = new ListNode(x);
                curr = curr.next;
            }
        }

        // Take k
        int k = sc.nextInt();

        // Rotate
        Solution s = new Solution();
        ListNode ans = s.rotateRight(head, k);

        // Print result
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
