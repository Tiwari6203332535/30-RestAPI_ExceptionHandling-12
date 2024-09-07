package in.happy.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3943816568103007656L;

	public UserNotFoundException() {
		
	}
    public UserNotFoundException(String msg) {
    	super(msg);
	}

}
