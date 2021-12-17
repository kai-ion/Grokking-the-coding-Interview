class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class RearrangeList {

  public static void reorder(ListNode head) {
    // TODO: Write your code here    
    if (head == null || head.next == null) {
      return;
    }


    ListNode middle = find_middle(head);

    ListNode reverseList = reverse_list(middle);
    ListNode firstHalfHead = head;

    while (firstHalfHead != null && reverseList != null) {
      ListNode temp = firstHalfHead.next;
      firstHalfHead.next = reverseList;
      firstHalfHead = temp;

      temp = reverseList.next;
      reverseList.next = firstHalfHead;
      reverseList = temp;
    }
    if (firstHalfHead != null) {
      firstHalfHead.next = null;
    }

  }



  public static ListNode find_middle(ListNode head) {
    ListNode fast = head, slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }

  public static ListNode reverse_list(ListNode head) {
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