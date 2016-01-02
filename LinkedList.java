public class LinkedList implements List {

	private ListItem start;

	LinkedList() {
		this.start = null;
	}

	public boolean isEmpty() {
		if (this.start == null) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int count = 0;
		if (this.start == null) {
			return count;
		} else {
			count++;
			ListItem value = this.start;
			while (value.getNext() != null) {
				count++;
				value = value.getNext();
			}

			return count;
		}
	}

	public ReturnObject get(int index) {
		if (index >= this.size() || index < 0) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			int count = 0;
			ListItem listItem = this.start;

			while (listItem.getNext() != null) {
				if (count == index) {
					return new ReturnObjectImpl(listItem.getValue());
				}

				listItem = listItem.getNext();
				count++;
			}

			return new ReturnObjectImpl(listItem.getValue());
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ListItem item = this.start;
			int count = 0;

			if (index == 0) {
				ListItem start = this.start;
				this.start = this.start.getNext();
				return new ReturnObjectImpl(start.getValue());
			}

			while (item.getNext() != null) {
				if (count == index - 1) {
					ListItem removedItem = item.getNext();
					if (removedItem != null) {
						item.setNext(item.getNext().getNext());
					} else {
						item.setNext(null);
					}
					
					return new ReturnObjectImpl(removedItem.getValue());
				}
				item = item.getNext();
				count++;
			}

			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} 
	}

	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			int count = 0;
			ListItem listItem = this.start;
			ListItem newListItem = new ListItem(item);

			while (listItem.getNext() != null) {
				if (count == index - 1) {
					newListItem.setNext(listItem.getNext());
					listItem.setNext(newListItem);
				}

				listItem = listItem.getNext();
				count++;
			}

			return new ReturnObjectImpl(null);
		}
	}

	public ReturnObject add(Object item) {

		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			ListItem newListItem = new ListItem(item);
			if (this.start == null) {
				this.start = newListItem;
			} else {
				ListItem value = this.start;

				while (value.getNext() != null) {
					value = value.getNext();
				}

				value.setNext(newListItem);
			}

			return new ReturnObjectImpl(null);
		}
	}
}