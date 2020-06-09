public class Solution {

  public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    LinkedListNode<Integer> current = head;

    if (head == null)
      return null;

    while (current.next != null) {
      if (current.data.equals(current.next.data)) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }

    return head;
  }

}
