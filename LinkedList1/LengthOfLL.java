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

	public static int length(LinkedListNode<Integer> head){
		int count = 0;
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
		
  }
  
}