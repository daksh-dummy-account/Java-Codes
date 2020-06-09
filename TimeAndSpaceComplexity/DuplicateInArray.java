public class DuplicateInArray {

  public static int duplicate(int[] arr) {
    // Sum of all elements in the array
    long sum = 0;
    for (int i = 0; i < arr.length; i++)
      sum += arr[i];

    // Sum of all natural numbers from 0 to N - 2, as array contains till N - 2
    int n = arr.length - 2;
    int sumOfNaturalNumbers = (n * (n + 1)) / 2;

    // Subtract them to get the missing number
    int result = (int) (sum - sumOfNaturalNumbers);
    return result;
  }

}