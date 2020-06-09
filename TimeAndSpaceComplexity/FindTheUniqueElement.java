public class FindUnique {

  public static int findUnique(int[] arr) {
    int xor = 0;
    for (int i = 0; i < arr.length; i++) {
      xor = xor ^ arr[i];
    }
    return xor;
  }

}
