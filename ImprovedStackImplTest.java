public class ImprovedStackImplTest {
	public static void main (String[] args) {
		System.out.println("Test start.");
		System.out.println("---------");

		ArrayList list = new ArrayList();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("One");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("One");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");

		System.out.println(list.isEmpty());
		System.out.println(list.size());

		System.out.println("---------");

		ImprovedStack stack    = new ImprovedStackImpl(list);
		// ImprovedStack reversed = stack.reverse();

		stack.remove("One");

		System.out.println(stack.size());

		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.pop().getReturnValue());

		System.out.println("---------");
		System.out.println("Test end.");
	}
}