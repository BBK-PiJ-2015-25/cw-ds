public class ArrayList implements List {

	private Object[] items;
	private int size;

	ArrayList(int size) {
		this.items = new Object[size];
		this.size = size;
	}

	public boolean isEmpty() {
		for (int i = 0; i < this.size; i++) {
			if (this.get(i).getReturnValue() != null) {
				return false;
			}
		}

		return true;
	}

	public int size() {
		int count = 0;
		for (int i = 0; i < this.size; i++) {
			if (this.items[i] != null) {
				count++;
			}
		}

		return count;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(this.items[index]);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= this.size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			Object item = this.get(index);
			
			for (int i = (index + 1); i < this.size; i++) {
				int newIndex = i - 1;
				this.items[newIndex] = this.items[i];
			}

			return new ReturnObjectImpl(item);
		}
	}

	public ReturnObject add(int index, Object object) {

		if (object == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (index >= this.size || index < 0 || this.size() >= this.size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			
			for (int i = this.size(); i > 0; i--) {
				int newIndex = i + 1;
				System.out.println(newIndex);
				this.items[newIndex] = this.items[i];
			}

			this.items[index] = object;

			return new ReturnObjectImpl();
		}
	}

	public ReturnObject add(Object object) {

		if (object == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			for (int i = 0; i < this.size; i++) {
				if (this.items[i] == null) {
					this.items[i] = object;
					return new ReturnObjectImpl();
				}
			}

			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
	}
}