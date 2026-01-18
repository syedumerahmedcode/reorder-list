public class Solution {

    public void reorderList(ListNode head) {
        /**
         * This solution has three parts:
         * 1 - Finding the middle of the list(Using fast and slow pointer apporach)
         * 2 - Creating a second list by reversing the list(from the middle pointer till
         * the end)
         * 3 - Merging the two lists by reordering them(as requested in the question)
         */
        /**
         * Checking edge case
         */
        if (head == null) {
            return;
        }
        /**
         * part 1
         */
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        /**
         * part 2
         */
        ListNode prev = null, curr = slow, temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        /**
         * part 3
         */
        ListNode first = head, second = prev;
        while (second.next != null) {
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }

    }

}
