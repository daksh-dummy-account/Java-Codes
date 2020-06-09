/*

	The given approach is not the best possible solution. 
	A better way will be taught later in the course once we
	cover the Time/Space Complexity in the Data Structures and 
	Algorithms part

*/

public class Solution {

  public static int arrayRotateCheck(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1])
        return (i + 1);
    }

    return 0;
  }

}