/***************
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Queue<Integer> st = new Queue<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.front());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}

************/
class QueueEmptyException extends Exception {

}

public class Queue<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;

	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if(front == null && rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public T dequeue() throws QueueEmptyException {
		if(isEmpty()) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		Node<T> temp = front;
		if(size == 1) {
			front = null;
			rear = null;
		}
		else {
			front = front.next;
			temp.next = null;
		}
		size--;
		return temp.data;
	}
	
	public T front() throws QueueEmptyException {
		if(isEmpty()) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return front.data;
	}
}
