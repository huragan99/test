package reverse.list;

class Node<T> {
	
	private T data;
	private Node<T> refToNext;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getRefToNext() {
		return refToNext;
	}
	public void setRefToNext(Node<T> refToNext) {
		this.refToNext = refToNext;
	}
}
