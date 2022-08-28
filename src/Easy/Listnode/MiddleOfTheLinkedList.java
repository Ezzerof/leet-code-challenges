package Easy.Listnode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {

        int count = 0;

        ListNode point = head;
        ListNode point2 = head;

        while (point2 != null && point2.next != null) {
            point = point.next;
            point2 = point2.next.next;
        }

        return point;
    }
}
