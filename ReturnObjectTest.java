/**
 * Class to test my ReturnObjectImpl class.
 *
 * ----------------------
 * SKIP THIS WHEN MARKING
 */
public class ReturnObjectTest {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println("--------------");

		// ReturnObjectImpl item = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);

		ReturnObjectImpl item = new ReturnObjectImpl("hello");

		// ReturnObjectImpl item = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);


		System.out.println(item.getError());
		// System.out.println();
		// System.out.println();

		System.out.println("--------------");
		System.out.println("Test finished.");
	}
}