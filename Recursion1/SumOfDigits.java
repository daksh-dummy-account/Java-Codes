public class solution {

  public static int sumOfDigits(int input) {
    int sum;
    if (input < 10) {
      return input;
    }
    sum = (input % 10) + sumOfDigits(input / 10);
    return sum;
  }
}
