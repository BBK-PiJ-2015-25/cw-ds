public class ArrayListTest {
	public static void main(String[] args) {
		System.out.println("ArrayListTest");
		System.out.println("-----------------");

		ArrayList list = new ArrayList(10);

		System.out.println(list.isEmpty());

		System.out.println("Current list size: " + list.size());

		list.add("Hello Dave");
		list.add("Hello World");
		list.add("Hi");
		list.add("FooBar");
		list.add("FizzBuzz");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");

		System.out.println("-----------------");
		System.out.println("Current list size: " + list.size());
		list.debugArray();

		list.add(4, "Add with index");

		list.add(15, "Add with index");

		list.debugArray();

		System.out.println("-----------------");
		System.out.println("End.");
	}
}