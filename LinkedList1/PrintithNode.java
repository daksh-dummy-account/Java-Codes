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

	public static void printIth(LinkedListNode<Integer> head, int i){
		int count = 0;
		if(head == null){
			return;
		}
		LinkedListNode<Integer> temp = head;
		while(temp != null && count< i){
			temp = temp.next;
			count++;
		}
		if(temp!= null){
			System.out.println(temp.data);
		}
	}
}