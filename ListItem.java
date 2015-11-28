public class ListItem {
	private ListItem next;
	private Object value;

	ListItem(Object value) {
	 	this.value = value;
	 	this.next = null;
	}

	public void setNext(ListItem item) {
		this.next = item;
	}

	public ListItem getNext() {
		return this.next;
	}

	public Object getValue() {
		return this.value;
	}
}