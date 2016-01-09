public class StackImpl extends AbstractStack {

	StackImpl (List list) {
		super(list);
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
}