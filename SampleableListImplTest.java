public class SampleableListImplTest {

	public static void main(String[] args) {
		System.out.println("Test start.");
		System.out.println("--------------");

		SampleableList list = new SampleableListImpl();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		list.sample();

		SampleableList sample = list.sample();

		System.out.println(sample.get(0).getReturnValue());
		System.out.println(sample.get(1).getReturnValue());
		System.out.println(sample.get(2).getReturnValue());
		System.out.println(sample.get(3).getReturnValue());
		System.out.println(sample.get(4).getReturnValue());
		System.out.println(sample.get(5).getReturnValue());
		System.out.println(sample.get(6).getReturnValue());
		System.out.println(sample.get(7).getReturnValue());
		System.out.println(sample.get(8).getReturnValue());

		System.out.println("--------------");
		System.out.println("Test end.");
	}
}