public class LinkedListTest {
	public static void main(String[] args) {
		System.out.println("LinkedListTest");
		System.out.println("--------------");

		LinkedList list = new LinkedList();

		System.out.println("Is my list empty: " + list.isEmpty());

		System.out.println("--------------");

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");

		System.out.println("Is my list empty: " + list.isEmpty());
		System.out.println("Current size: " + list.size());
		System.out.println("--------------");

		list.add(1, "New Item");
		list.add(7, "New Item");
		System.out.println("Current size: " + list.size());

		// System.out.println("--------------");

		// System.out.println(list.get(0).getReturnValue());
		// System.out.println(list.get(1).getReturnValue());
		// System.out.println(list.get(2).getReturnValue());
		// System.out.println(list.get(3).getReturnValue());
		// System.out.println(list.get(4).getReturnValue());
		// System.out.println(list.get(5).getReturnValue());
		// System.out.println(list.get(6).getReturnValue());
		// System.out.println(list.get(7).getReturnValue());
		// System.out.println(list.get(8).getReturnValue());
		// System.out.println(list.get(9).getReturnValue());
		// System.out.println(list.get(10).getReturnValue());

		// System.out.println("--------------");

		System.out.println(list.remove(8).getReturnValue());
		System.out.println(list.remove(0).getReturnValue());

		System.out.println("--------------");

		System.out.println(list.get(0).getReturnValue());
		System.out.println(list.get(1).getReturnValue());
		System.out.println(list.get(2).getReturnValue());
		System.out.println(list.get(3).getReturnValue());
		System.out.println(list.get(4).getReturnValue());
		System.out.println(list.get(5).getReturnValue());
		System.out.println(list.get(6).getReturnValue());
		System.out.println(list.get(7).getReturnValue());
		System.out.println(list.get(8).getReturnValue());
		System.out.println(list.get(9).getReturnValue());

		System.out.println("Current size: " + list.size());

		System.out.println("--------------");
		System.out.println("End.");
	}
}