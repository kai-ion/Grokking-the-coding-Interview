class ListNode {
    int value = 0;
    ListNode next;
  
    ListNode(int value) {
      this.value = value;
    }
  }
  
  class LinkedListCycle {
  
    public static boolean hasCycle(ListNode head) {
      // TODO: Write your code here

      //have a fast and slow pointer both starting at head
      ListNode fast = head;
      ListNode slow = head;

      //continue running until fast hits the end at null
      while (fast != null && fast.next != null) {
          //fast moves 2 steps while slow moves 1 step
          fast = fast.next.next;
          slow = slow.next;

        //continue running until fast and slow meet
          if ( slow == fast) {
              return true;
          }
      }

      return false;
    }
  
    public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(6);
      System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
  
      head.next.next.next.next.next.next = head.next.next;
      System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
  
      head.next.next.next.next.next.next = head.next.next.next;
      System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
    }
  }