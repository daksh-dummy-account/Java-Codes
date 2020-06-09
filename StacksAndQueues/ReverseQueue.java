public class Solution {

  public static void reverseQueue(Queue<Integer> q) {
    if (q.size() <= 1) {
      return;
    }
    int front = q.dequeue();
    reverseQueue(q);
    q.enqueue(front);
  }
}