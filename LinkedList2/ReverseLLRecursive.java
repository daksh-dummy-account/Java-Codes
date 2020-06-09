public class Solution {

  public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
    if (head.next == null) {
      return head;
    }

    LinkedListNode<Integer> finalHead = reverse_R(head.next);
    head.next.next = head;
    head.next = null;
    return finalHead;
  }

}
