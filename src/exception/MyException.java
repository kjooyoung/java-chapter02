package exception;

public class MyException extends Exception{
	//내가 나의 Exception을 던지고 싶을때
	
	private static final long serialVersionUID = 1L;
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException() {
		super("MyException 발생");
	}
}
