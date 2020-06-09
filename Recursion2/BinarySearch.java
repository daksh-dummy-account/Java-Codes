public class solution {

  public static int binarySearchHelper(int input[], int start, int end, int element) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;
    if (input[mid] == element) {
      return mid;
    } else if (input[mid] > element) {
      return binarySearchHelper(input, start, mid - 1, element);
    } else {
      return binarySearchHelper(input, mid + 1, end, element);
    }
  }

  public static int binarySearch(int input[], int element) {
    return binarySearchHelper(input, 0, input.length - 1, element);
  }
}
