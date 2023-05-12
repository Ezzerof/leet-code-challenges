package Easy.Listnode;

public class PalindromeLinkedList {


    public static boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;

        StringBuilder sb = new StringBuilder();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy.next;
        sb.append(head.val);

        while (start.next != null) {
            ListNode toChange = start.next;
            start.next = toChange.next;
            toChange.next = dummy.next;
            dummy.next = toChange;
            sb.append(toChange.val);
        }

        return sb.toString().contentEquals(sb.reverse());
    }
}
