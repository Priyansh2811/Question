delete the middle node of a linked list, given only access to that node.

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class delete_middle_node {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before deletion:");
        printList(head);

        // Deleting the middle node (node with value 3)
        deleteNode(head.next.next);

        System.out.println("After deletion:");
        printList(head);
    }

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Can't delete the last node or a null node
        }
        
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        
        // Bypass the next node
        node.next = node.next.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}