

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

	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		if(head.data.equals(n)) {
			return 0;
		}
		
		int i = indexOfNRec(head.next,n);
		if(i != -1) {
			return i + 1;
		}
		else {
			return -1;
		}
		
	}
}