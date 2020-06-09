public class solution {

  public static boolean splitArray(int arr[]) {
    return check(arr, 0, 0, 0);
  }

  public static boolean check(int arr[], int startIndex, int leftSum, int rightSum) {
    if (startIndex == arr.length) {
      if (leftSum == rightSum)
        return true;
      else
        return false;
    }
    if (arr[startIndex] % 5 == 0) {
      leftSum += arr[startIndex];
    } else if (arr[startIndex] % 3 == 0) {
      rightSum += arr[startIndex];
    } else {
      boolean leftAns = check(arr, startIndex + 1, leftSum + arr[startIndex], rightSum);
      boolean rightAns = check(arr, startIndex + 1, leftSum, rightSum + arr[startIndex]);
      if (leftAns || rightAns)
        return true;
      else
        return false;
    }
    return check(arr, startIndex + 1, leftSum, rightSum);
  }

}