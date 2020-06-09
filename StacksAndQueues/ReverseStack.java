import java.util.Stack;

public class Solution {

  public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
    if (s1.size() <= 1) {
      return;
    }
    int lastElement = s1.pop();
    reverseStack(s1, s2);
    while (!s1.isEmpty()) {
      int a = s1.pop();
      s2.push(a);
    }

    s1.push(lastElement);
    while (!s2.isEmpty()) {
      int b = s2.pop();
      s1.push(b);
    }
  }
}