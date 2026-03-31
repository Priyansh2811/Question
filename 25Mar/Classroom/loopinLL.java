
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class loopinLL {
    public static void main(String[] args) {
        // Create a linked list with a loop
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creates a loop

        // Detect if there's a loop
        if (hasLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }

    public static boolean hasLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2

            if (slow == fast) { // Loop detected
                return true;
            }
        }
        return false; // No loop
    }
}