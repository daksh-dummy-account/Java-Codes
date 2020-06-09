public class Solution {

  public static int partition(int[] input, int startIndex, int endInedx) {
    int pivot = input[startIndex];
    int count = 0;
    for (int i = startIndex + 1; i <= endInedx; i++) {
      if (input[i] <= pivot) { // Including equal
        count++;
      }
    }
    int pivotIndex = startIndex + count;
    input[startIndex] = input[pivotIndex];
    input[pivotIndex] = pivot;

    int i = startIndex, j = endInedx;
    while (i < j) {
      while (i <= endInedx && input[i] <= pivot) {
        i++;
      }
      while (input[j] > pivot) {
        j--;
      }
      if (i <= j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        i++;
        j--;
      }
    }
    return pivotIndex;
  }

  public static void quickSort(int[] input, int startIndex, int endInedx) {
    if (startIndex >= endInedx) {
      return;
    }
    int partitionIndex = partition(input, startIndex, endInedx);
    quickSort(input, startIndex, partitionIndex - 1);
    quickSort(input, partitionIndex + 1, endInedx);
  }

  public static void quickSort(int[] input) {
    quickSort(input, 0, input.length - 1);
  }

}