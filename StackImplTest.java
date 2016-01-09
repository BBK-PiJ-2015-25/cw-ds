public class StackImplTest {

	public static void main(String[] args) {
		System.out.println("Start test.");
		System.out.println("----------------");

		List list = new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");

		System.out.println(list.size());
		System.out.println("----------------");

		Stack stack = new StackImpl(null);

		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.top().getReturnValue());

		// System.out.println("----------------");
		// System.out.println(stack.pop().getReturnValue());
		// System.out.println(stack.pop().getReturnValue());
		// System.out.println(stack.pop().getReturnValue());

		System.out.println("----------------");
		stack.push("six");
		stack.push("seven");
		stack.push("eight");
		stack.push("nine");
		stack.push("ten");

		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());

		System.out.println("----------------");
		System.out.println("End test.");
	}
}