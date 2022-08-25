package Easy.Listnode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode previous = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }

        return previous;
    }

    public static void main(String[] args) {

    }
}
