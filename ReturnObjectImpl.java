public class ReturnObjectImpl implements ReturnObject {

	private boolean hasError;
	private ErrorMessage error;
	private Object object;

	/**
	 * If we need to set an error this constructor will be called.
	 * 
	 * @param ErrorMessage err
	 */
	ReturnObjectImpl(ErrorMessage err) {
		this.error = err;
		this.hasError = true;
	}

	/**
	 * If we need to set an object them this constructor will be called
	 * to set the object property and set the hasError property to false.
	 */
	ReturnObjectImpl(Object object) {
		this.object = object;
		this.hasError = false;
	}

	public boolean hasError() {
		return this.hasError;
	}

	public ErrorMessage getError() {
		if (this.hasError()) {
			return this.error;
		} else {
			return ErrorMessage.NO_ERROR;
		}
	}

	public Object getReturnValue() {
		if (!this.hasError()) {
			return this.object;
		} else {
			return null;
		}
	} 
}