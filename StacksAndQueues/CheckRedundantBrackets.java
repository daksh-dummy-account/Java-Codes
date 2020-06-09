import java.util.Stack;

public class solution {

  public static boolean checkRedundantBrackets(String input) {
    Stack<Character> s = new Stack<Character>();

    boolean flag = false;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) != ')') {
        s.push(input.charAt(i));
      } else {
        while (s.peek() != '(') {
          s.pop();
          flag = true;
          if (s.isEmpty()) {
            break;
          }
        }
        if (s.isEmpty()) {
          continue;
        }
        if (flag) {
          s.pop();
          flag = false;
        } else {
          return true;
        }
      }
    }
    return false;
  }
}