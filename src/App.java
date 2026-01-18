import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * You are given the head of a singly linked-list. The list can be represented
         * as:
         * 
         * L0 → L1 → … → Ln - 1 → Ln
         * 
         * Reorder the list to be on the following form:
         * 
         * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
         * 
         * You may not modify the values in the list's nodes. Only nodes themselves may
         * be changed.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: head = [1,2,3,4]
         * Output: [1,4,2,3]
         * 
         * Example 2:
         * 
         * Input: head = [1,2,3,4,5]
         * Output: [1,5,2,4,3]
         * 
         */
        System.out.println("Hello, World!");
        ListNode list = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        list.next = node2; // 1 -> 2
        node2.next = node3; // 2 -> 3
        node3.next = node4; // 3 -> 4
        node4.next = node5; // 4 -> 5
        System.out.println("The given list is:");
        printList(list);
    }

    public static void printReverse(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Pop elements to display in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
