
class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class PalindromicLinkedList {

  public static boolean isPalindrome(ListNode head) {
    // TODO: Write your code here

    //get middle of linked list
    ListNode middle = PalindromicLinkedList.find_Middle(head);

    //reverse everthing from middle of linkedList
    ListNode secondHalf = PalindromicLinkedList.reverse_List(middle);
    //store head of reveresed linked list
    ListNode headSecondHalf = secondHalf;

    while (head!= null && secondHalf != null) {
        if (head.value != secondHalf.value) {
            break;
        }

        head = head.next;
        secondHalf = secondHalf.next;
    }

    reverse_List(headSecondHalf);

    if (head == null || secondHalf == null) {
        return true;
    }


    return false;
  }

  public static ListNode find_Middle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }


      return slow;
  }

  //Reverse a linkedList
  public static ListNode reverse_List (ListNode curr) {
    //new end of List
    ListNode prev = null;

    
    while (curr != null) {
        ListNode next = curr.next; //store next node
        curr.next = prev; //set next node to be previous node
        prev = curr; //change prev node = curr node
        curr = next; //set curr node to the stored next node
    }


      return prev; //return the new head of reversed linkedlist
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    head.next = new ListNode(4);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(2);
    System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));

    head.next.next.next.next.next = new ListNode(2);
    System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));
  }
}