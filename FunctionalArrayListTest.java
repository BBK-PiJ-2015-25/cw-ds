public class FunctionalArrayListTest {

	public static void main(String[] args) {
		
		FunctionalArrayList list = new FunctionalArrayList(10);

		System.out.println(list.isEmpty());
		System.out.println("Current list size: " + list.size());

		list.add("Hello Bro");
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

		System.out.println(list.isEmpty());
		System.out.println("Current list size: " + list.size());

		System.out.println("-----------------");

		System.out.println(list.head().getReturnValue());

		System.out.println("-----------------");

		FunctionalList rest = list.rest();
	}
}