public class solution {

  public static int multiplyTwoIntegers(int x, int y) {

    if (x == 0 || y == 0) {
      return 0;
    }

    if (y == 1) {
      return x;
    } else {
      int result = x + multiplyTwoIntegers(x, y - 1);
      return result;
    }

  }
}
