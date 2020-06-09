public class Solution {

  public static boolean checkSequence(String s, String t) {

    if (t.length() == 0) {
      return true;
    }

    if (s.length() == 0) {
      return false;
    }

    if (s.charAt(0) == t.charAt(0)) {
      return checkSequence(s.substring(1), t.substring(1));
    } else {
      return checkSequence(s.substring(1), t);
    }

  }

}