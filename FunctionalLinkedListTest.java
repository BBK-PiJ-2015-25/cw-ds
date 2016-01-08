public class FunctionalLinkedListTest {

	public static void main(String[] args) {
		System.out.println("Test start.");
		
		FunctionalLinkedList list = new FunctionalLinkedList();

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		list.add("One");
		list.add("Two");
		list.add("Tree");
		list.add("Four");
		list.add("Five");
		list.add("Six");

		System.out.println("--------------------");

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		System.out.println("--------------------");

		System.out.println(list.head().getReturnValue());

		System.out.println("--------------------");

		FunctionalList rest = list.rest();

		System.out.println(rest.get(0).getReturnValue());
		System.out.println(rest.get(1).getReturnValue());
		System.out.println(rest.get(2).getReturnValue());
		System.out.println(rest.get(3).getReturnValue());
		System.out.println(rest.get(4).getReturnValue());
		System.out.println(rest.get(5).getReturnValue());

		System.out.println("Test End.");
	}
}