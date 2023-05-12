package Medium.list_node;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode leftNode = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode toChange = leftNode.next;
            leftNode.next = toChange.next;
            toChange.next = prev.next;
            prev.next = toChange;
        }

        return dummy.next;
    }


}
