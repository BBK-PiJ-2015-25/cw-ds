public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	FunctionalLinkedList () {
		super();
	}

	public ReturnObject head() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			// My Linked List index starts at zero
			return new ReturnObjectImpl(this.get(0).getReturnValue());
		}
	}

	public FunctionalList rest() {
		if (this.isEmpty()) {
			return new FunctionalLinkedList();
		} else {
			FunctionalList rest = new FunctionalLinkedList();
			int size 			= this.size();

			// Start the loop at one so we skip the first item
			for (int i = 1; i < size; i++) {
				rest.add(this.get(i).getReturnValue());
			}

			return rest;
		}
	}
}