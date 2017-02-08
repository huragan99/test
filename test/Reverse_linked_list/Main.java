package reverse.list;

/*
 * http://www.java2novice.com/java-interview-programs/revese-singly-linked-list/
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList<Integer> list = new ReverseLinkedList<>();
		list.add(4);
		list.add(9);
		list.add(34);
		list.showList();
		list.reverseList();
		list.showList();

	}

}
