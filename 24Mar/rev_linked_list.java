import java.util.Stack;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class rev_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (enter -1 to stop):");

        ListNode head = null;
        ListNode tail = null;

        while (true) {
            int data = sc.nextInt();
            if (data == -1) break; // Exit condition

            ListNode newNode = new ListNode(data);

            if (head == null) {
                // First element becomes the head
                head = newNode;
                tail = newNode;
            } else {
                // Link the new node to the end and move the tail
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Now you can pass 'head' to your reversal function!
        printList(head);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}