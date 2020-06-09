import java.util.Stack;

public class Solution {

  // Function returns -1 if brackets can't be balanced
  public static int countBracketReversals(String input) {

    if (input.length() == 0)
      return 0;

    // if given string has odd length, then reversal is not possible
    if (input.length() % 2 != 0)
      return -1;

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (currentChar == '{') {
        stack.push(currentChar);
      } else {
        // pop if there is a balanced pair
        if (!stack.isEmpty() && stack.peek() == '{') {
          stack.pop();
        } else { // else, push it to the stack
          stack.push(currentChar);
        }
      }
    }

    int count = 0;

    // only unbalanced brackets are there in stack now
    while (!stack.isEmpty()) {

      char char1 = stack.pop();
      char char2 = stack.pop();

      // if both char1 and char2 are opposite i.e. char1 = } and char2 = {, then we
      // need to reverse both of them
      if (char1 != char2) {
        count = count + 2;
      }
      // if both char1 and char2 are same i.e. either of them are {{ or }}, then we
      // need only 1 reversal
      else {
        count = count + 1;
      }
    }

    return count;

  }

}