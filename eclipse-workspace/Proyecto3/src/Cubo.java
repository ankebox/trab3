public class Cubo extends Figura {

	private double lado;
	private String area;
	private String volumen;
	private Boolean bError;
	
	
	public Cubo() {
		this.bError = true;
	}
	/**
	 * Metodo para calcular el area
	 *  
	 * */
	public void calcularArea() {
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el area del cubo ");
		int terminado = 0;
		int intentos = 0;
		this.lado = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el lado valdra " + lado);
		area = df.format(6 * Math.pow(this.lado, 2));
		logMenaje(rutaLog, " Con estos datos el area sera igual a " + area);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el area del cubo que su lado mide : " + lado);
					respuesta = sn.next();
					logMenaje(rutaLog, " El alumno ha propuesto de respuesta para el area  " + respuesta);
					intentos++;
					h.validarRespuesta(respuesta, rutaLog);
					if(respuesta.equals(area)) {
						System.out.println("EnhoraBuena has acertado el resultado correctamente el resultado el area es ciertamente " + area + "\n");
						logMenaje(rutaLog, " El alumno ha acertado correctamente el area en " + intentos + " intentos");
						terminado = 1;
						bError = false;
					}
					else {
						System.out.println("Oh no has fallado debes intentarlo de nuevo y intentando aplicar la siguiente pauta\n");
						logMenaje(rutaLog, " El alumno ha fallado la respuesta y debera proponer una nueva respuesta");
						System.out.println("El área de la superficie de un cubo calcula elevando al cubo su arista y multiplicando el resultado por 6");
						System.out.println("Fórmula para calcular el área de un cubo: A = 6*a*a");
					}
				}
			}catch(CustomException e) {
				System.out.println("error" + e.getMessage());	
			}
		}while (bError);
		System.out.println("Lo has logrado en " + intentos + " intentos.\n\n");	
	}
	/**
	 * Metodo para calcular el volumen
	 *  
	 * */
	public void calcularVolumen() {
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el volumen del cubo ");
		int terminado = 0;
		int intentos = 0;
		this.lado = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el lado valdra " + lado);
		volumen = df.format(Math.pow(this.lado, 3));
		logMenaje(rutaLog, " Con estos datos el volumen sera igual a " + volumen);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el volumen de un cubo que su lado mide : " + lado);
					respuesta = sn.next();
					logMenaje(rutaLog, " El alumno ha propuesto de respuesta para el volumen  " + respuesta);
					intentos++;
					h.validarRespuesta(respuesta, rutaLog);
					if(respuesta.equals(volumen)) {
						System.out.println("EnhoraBuena has acertado el resultado correctamente el resultado el volumen es ciertamente " + volumen + "\n");
						logMenaje(rutaLog, " El alumno ha acertado correctamente el volumen en " + intentos + " intentos");
						terminado = 1;
						bError = false;
					}
					else {
						System.out.println("Oh no has fallado debes intentarlo de nuevo y intentando aplicar la siguiente pauta\n");
						logMenaje(rutaLog, " El alumno ha fallado la respuesta y debera proponer una nueva respuesta");
						System.out.println("El volumen de un cubo es igual elevar al cubo la longitud de su lado ");
						System.out.println("Formula para calcular el volumen del cubo : V = L*L*L");
					}
				}
			}catch(CustomException e) {
				System.out.println("error" + e.getMessage());	
			}
		}while (bError);
		System.out.println("Lo has logrado en " + intentos + " intentos.\n\n");
	}
}
