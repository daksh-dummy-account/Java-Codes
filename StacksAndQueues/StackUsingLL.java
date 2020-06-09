/***********

public static void main(String[] args) throws StackEmptyException {
        Scanner s = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<Integer>();
        
        int choice = s.nextInt();
        int input;
        
        if(choice == 1) {
            input = s.nextInt();
            st.push(input);
        }
        else if(choice == 2) {
            System.out.println(st.pop());
        }
        else if(choice == 3) {
            System.out.println(st.top());
        }
        else if(choice == 4) {
        	System.out.println(st.size());
        }
        else if(choice == 5) {
        	System.out.println(st.isEmpty());
        }
        else {
            return;
        }
    }
}

************/
class StackFullException extends Exception {

}

class StackEmptyException extends Exception {

}

public class Stack<T> {
	private Node<T> head;
	private int size;
	
	public Stack() {
		size = 0;
		head = null;
	}
	
	public int size() {
		return size;
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T pop() throws StackEmptyException {
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public T top() throws StackEmptyException {
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
}
