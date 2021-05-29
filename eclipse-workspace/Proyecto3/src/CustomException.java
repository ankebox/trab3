
public class CustomException extends Exception{
	
	/**
	 * Metodo para pasar el mensaje de error
	 * @param mensaje mensaje a saltar en el error 
	 * */
	public CustomException(String mensaje) {
		super(mensaje);
	}
	 
	/**
	 * Metodo no usado pero puesto porque es mas correcto asi
	 * */
	public CustomException() {
		super("Formato no valido");
	}

}
