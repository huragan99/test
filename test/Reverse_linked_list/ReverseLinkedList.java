package reverse.list;

public class ReverseLinkedList<T> {
	
	private Node<T> head;
	
	public void add(T value) {
		
		Node<T> tmp = head;
		Node<T> next = new Node<T>();
		next.setData(value);
		while (true) {
			if (head == null) {
				head = next;
				break;
			} 
			else if (tmp.getRefToNext() == null) {
				tmp.setRefToNext(next);
				break;
			}
			else {
				tmp = tmp.getRefToNext();
			}
		}
		
	}
	
	public void reverseList() {
		Node<T> curr = head;
		Node<T> tmp = null; 
		Node<T>	next = null;
		while (curr != null) {
			next = curr.getRefToNext();
			curr.setRefToNext(tmp);
			tmp = curr;
			curr = next;
		}
		head = tmp;
	}
	
	public void showList() {
		Node<T> tmp = head;
		while(true) {
			if (tmp != null) {
				System.out.println(tmp.getData());
				tmp = tmp.getRefToNext();
			}
			else {
				break;
			}
		}
	}
}
