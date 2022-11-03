package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode list = new ListNode(0, head);
        ListNode list2 = list;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                list2.next = head.next;
            } else {
                list2 = list2.next;
            }
            head = head.next;
        }

        return list.next;

    }

}
