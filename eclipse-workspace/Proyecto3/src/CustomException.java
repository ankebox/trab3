
public class CustomException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public CustomException(String mensaje) {
		super(mensaje);
	}
	public CustomException() {
		super("Formato no valido");
	}

}
