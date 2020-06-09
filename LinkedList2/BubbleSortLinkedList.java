public class Solution {

  private static int length(LinkedListNode<Integer> head) {
    int count = 0;
    while (head != null) {
      head = head.next;
      count++;
    }
    return count;

  }

  public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
    int n = length(head);

    for (int i = 0; i < n - 1; i++) {
      LinkedListNode<Integer> prev = null;
      LinkedListNode<Integer> curr = head;
      for (int j = 0; j < n - i - 1; j++) {
        if (curr.data <= curr.next.data) {
          prev = curr;
          curr = curr.next;
        } else {
          if (prev == null) {
            LinkedListNode<Integer> fwd = curr.next;
            head = head.next;
            curr.next = fwd.next;
            fwd.next = curr;
            prev = fwd;
          } else {
            LinkedListNode<Integer> fwd = curr.next;
            prev.next = fwd;
            curr.next = fwd.next;
            fwd.next = curr;
            prev = fwd;
          }
        }
      }
    }
    return head;
  }
}
