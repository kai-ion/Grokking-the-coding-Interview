import java.util.*;

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class RotateList {

  public static ListNode rotate(ListNode head, int rotations) {
    // TODO: Write your code here

    ListNode lastNode = head;
    ListNode rotatedLastNode = head;

    int len = 1;
    int skipLen = 0;
    

    while (lastNode.next != null) {
      lastNode = lastNode.next;
      len++;
    }

    rotations %= len;

    lastNode.next = head;

    for (int i = 0; i < rotations - 1; i++) {
      rotatedLastNode = rotatedLastNode.next;
    }
    
    head = rotatedLastNode.next;
    rotatedLastNode.next = null;
    

    return head;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    ListNode result = RotateList.rotate(head, 3);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}