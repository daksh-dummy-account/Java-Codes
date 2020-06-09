public class Solution {

  public static int lastIndex(int input[], int x, int startIndex) {
    if (startIndex == input.length) {
      return -1;
    }
    int smallAns = lastIndex(input, x, startIndex + 1);
    if (smallAns != -1) {
      return smallAns;
    }
    if (input[startIndex] == x) {
      return startIndex;
    } else {
      return -1;
    }
  }

  public static int lastIndex(int input[], int x) {
    return lastIndex(input, x, 0);
  }

}