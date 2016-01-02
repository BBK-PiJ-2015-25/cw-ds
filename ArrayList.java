import java.util.Arrays;

public class ArrayList implements List {

	private Object[] items;
	private int sizeOfArray;
	private int maximumSizeOfArray;

	ArrayList(int size) {
		this.items       		= new Object[size];
		this.sizeOfArray 		= size;
		this.maximumSizeOfArray = size;
	}

	public boolean isEmpty() {
		for (int i = 0; i < this.maximumSizeOfArray; i++) {
			if (this.get(i).getReturnValue() != null) {
				return false;
			}
		}

		return true;
	}

	public int size() {
		int count = 0;
		for (int i = 0; i < this.maximumSizeOfArray; i++) {
			if (this.items[i] != null) {
				count++;
			}
		}

		return count;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= this.maximumSizeOfArray) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(this.items[index]);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= this.maximumSizeOfArray) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			Object item = this.get(index);
			
			for (int i = index; i < this.maximumSizeOfArray; i++) {
				int targetIndex = i + 1;
				if (targetIndex >= this.maximumSizeOfArray) {
					this.items[i] = null;
				} else {
					this.items[i] = this.items[targetIndex];
				}
			}

			return new ReturnObjectImpl(item);
		}
	}

	public ReturnObject add(int index, Object object) {

		if (object == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (index >= this.maximumSizeOfArray || index < 0) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			// If the array is full extend the size of the array
			this.extendArrayCheck();
			
			for (int i = this.maximumSizeOfArray; i > 0; i--) {
				int newIndex = i + 1;
				if (newIndex < this.maximumSizeOfArray) {
					this.items[newIndex] = this.items[i];
				}
			}

			this.items[index] = object;

			return new ReturnObjectImpl(null);
		}
	}

	public ReturnObject add(Object object) {

		if (object == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			// If the array is full extend the size of the array
			this.extendArrayCheck();

			for (int i = 0; i < this.maximumSizeOfArray; i++) {
				if (this.items[i] == null) {
					this.items[i] = object;
					return new ReturnObjectImpl(null);
				}
			}

			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
	}

	private void extendArrayCheck() {
		if (this.maximumSizeOfArray == this.size()) {
			this.extendArray();
		}
	}

	private void extendArray() {
		Object[] oldArray 		= this.items;
		int newSize 			= this.sizeOfArray + this.size();
		this.maximumSizeOfArray = newSize;
		this.items 		  		= new Object[newSize];
		int l 			  		= oldArray.length;

		for (int i = 0; i < l; i++) {
			this.items[i] = oldArray[i];
		}
	}

	public void debugArray() {
		System.out.println(Arrays.toString(this.items));
	}
}