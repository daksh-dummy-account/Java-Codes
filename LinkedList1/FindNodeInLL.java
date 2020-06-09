/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		int i = 0;
		while(head != null) {
			if(head.data.equals(n)) {
				return i;
			}
			head = head.next;
			i++;
		}
		
		return -1;
	}
}