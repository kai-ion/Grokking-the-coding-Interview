
class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class RearrangeList {

  public static void reorder(ListNode head) {
    if (head == null || head.next == null)
      return;

    // find the middle of the LinkedList
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // slow is now pointing to the middle node
    ListNode headSecondHalf = reverse(slow); // reverse the second half
    ListNode headFirstHalf = head;

    // rearrange to produce the LinkedList in the required order
    while (headFirstHalf != null && headSecondHalf != null) {
      ListNode temp = headFirstHalf.next;
      headFirstHalf.next = headSecondHalf;
      headFirstHalf = temp;

      temp = headSecondHalf.next;
      headSecondHalf.next = headFirstHalf;
      headSecondHalf = temp;
    }

    // set the next of the last node to 'null'
    if (headFirstHalf != null)
      headFirstHalf.next = null;
  }

  private static ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    head.next = new ListNode(4);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(8);
    head.next.next.next.next = new ListNode(10);
    head.next.next.next.next.next = new ListNode(12);
    RearrangeList.reorder(head);
    while (head != null) {
      System.out.print(head.value + " ");
      head = head.next;
    }
  }
}