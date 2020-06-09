public class Solution {

  public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
    if (head != null) {
      LinkedListNode<Integer> prev = head;
      LinkedListNode<Integer> now = head.next;
      while (prev != null && now != null) {
        prev.next = now.next;
        now = null;
        prev = prev.next;
        if (prev != null) {
          now = prev.next;
        }
      }
    }
  }

}
