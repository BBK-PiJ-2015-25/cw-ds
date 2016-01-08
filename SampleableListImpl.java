public class SampleableListImpl extends LinkedList implements SampleableList {

	public SampleableList sample() {
		SampleableList list = new SampleableListImpl();

		if (this.isEmpty()) {
			return list;
		} else {
			int size = this.size();
			int i = 0;

			while (i < size) {
				ReturnObject item = this.get(i);

				if (!item.hasError()) {
					list.add(item.getReturnValue());
					i = i+2;
				} else {
					break;
				}
			}

			return list;
		}
	}
}