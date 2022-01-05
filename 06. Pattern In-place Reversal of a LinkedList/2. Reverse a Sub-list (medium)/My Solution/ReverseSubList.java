import java.util.*;

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class ReverseSubList {

  public static ListNode reverse(ListNode head, int p, int q) {
    // TODO: Write your code here
    ListNode prev = null;
    ListNode curr = head;
    ListNode next;

    ListNode frontendNode;
    ListNode subListendNode;

    if (p == q) {
      return head;
    }

    for (int i = 0; i < p - 1 && curr != null; i++) {
      prev = curr;
      curr = curr.next;
    }

    frontendNode = prev;
    subListendNode = curr;

    for (int i = 0; i < q - p + 1 && curr != null;  i++) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    if (frontendNode != null) {
      frontendNode.next = prev;
    }
    else {
      head = prev;
    }

    subListendNode.next = curr;

    return head;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode result = ReverseSubList.reverse(head, 2, 4);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}