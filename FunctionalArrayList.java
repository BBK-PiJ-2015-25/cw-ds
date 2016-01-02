public class FunctionalArrayList extends ArrayList implements FunctionalList {

	FunctionalArrayList () {
		super();
	}

	FunctionalArrayList (int size) {
		super(size);
	}

	public ReturnObject head() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return this.get(0);
		}
	}

	public FunctionalList rest() {
		if (this.isEmpty()) {
			return new FunctionalArrayList();
		} else {
			FunctionalArrayList restList = new FunctionalArrayList();

			for (int i = 1; i < this.size(); i++) {
				restList.add(this.get(i).getReturnValue());
			}

			return restList;
		}
	}
}