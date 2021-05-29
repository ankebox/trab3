public class MiHelper {

	/**
	 * Metodo para calcular el volumen
	 * @param respuesta la respuesta del usuario a compprobar formato
	 * @param rutaLog la ruta donde guardar log cuando salte excepcion 
	 * */
	public void validarRespuesta(String respuesta, String rutaLog) throws CustomException{
		int sizeHola = 0;// esto va a guardar cuantos caracteres hay desde la coma hasta el final del resultado
		String hola;
		if(!(respuesta.contains(","))) {// esta condicion se realiza para comprobar que la respuesta introducida por el usuario contiene una coma
			Figura.logMenaje(rutaLog, " El usuario ha introducido incorrectamente el formato del resultado se ha olvidado de poner la coma y la parte decimal");
			throw new CustomException("El formato del resultado debe contener una coma e ir seguido de dos decimales");
		}
		hola = respuesta.substring(respuesta.indexOf(",")); //aqui genero un string que contiene los caracteres que hay desde la coma del resultado introducido por el usuario 
		sizeHola = hola.length();
		if(!(sizeHola == 3)) { // esta condicion se realiza para comprobar que la respuesta contiene unicamente 2 decimales despues de la coma
			Figura.logMenaje(rutaLog, " El usuario ha introducido incorrectamente el formato del resultado ha de introducir solo 2 decimales");
			throw new CustomException("El formato del resultado debe ser igual a #,00");
		}
	}
}
