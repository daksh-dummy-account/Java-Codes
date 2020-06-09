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

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		if(head == null){
			return head;
		}
		if(i == 0){
			return head.next;
		}
		int count = 0;
		LinkedListNode<Integer> temp = head;
		while(temp != null && count < i-1){
			temp = temp.next;
			count++;
		}
		if(temp == null) {
			return head;
		}
		if(temp.next != null) {
			temp.next = temp.next.next;
		}
		return head;
	}
}