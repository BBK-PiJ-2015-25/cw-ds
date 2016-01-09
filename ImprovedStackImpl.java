public class ImprovedStackImpl implements ImprovedStack {

	private List internalList;

	ImprovedStackImpl (List list) {
		this.internalList = list;
	}

	public boolean isEmpty() {
		if (this.internalList == null) {
			return true;
		} else {
			return this.internalList.isEmpty();
		}
		
	}

	public int size() {
		if (this.internalList == null) {
			return 0;
		} else {
			return this.internalList.size();
		}
	}

	public void push(Object item) {
		if (this.internalList == null) {
			this.internalList = new ArrayList();
		}

		this.internalList.add(item);
	}

	public ReturnObject top() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			int length = this.size();
			return this.internalList.get(length-1);
		}
	}

	public ReturnObject pop() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			int length = this.size();
			return this.internalList.remove(length-1);
		}
	}

	public ImprovedStack reverse() {
		List tempList          = this.internalList;
		ImprovedStack reversed = new ImprovedStackImpl(new ArrayList());
		int length             = this.size();

		for (int i = 0; i < length; i++) {
			reversed.push(this.pop().getReturnValue());
		}

		this.internalList = tempList;

		return reversed;
	}

	public void remove(Object object) {
		int length  = this.size();
		int pointer = 0;

		for (int i = 0; i < length; i++) {
			ReturnObject item = this.internalList.get(pointer);

			if (item.getReturnValue().equals(object)) {
				this.internalList.remove(pointer);
			} else {
				pointer++;
			}
		}
	} 
}