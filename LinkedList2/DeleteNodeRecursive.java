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

	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
		if(head == null) {
			return head;
		}
		if (i == 0) {
			return head.next;
		}
		head.next = deleteIthNodeRec(head.next, i-1);
		return head;
	}
}