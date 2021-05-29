public class Esfera extends Figura{
	
	private double radio;
	private Boolean bError;
	private String area;
	private String volumen;
	
	public Esfera() {
		this.bError = true;
	}
	
	/**
	 * Metodo para calcular el area 
	 * */
	public void calcularArea() {
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el area de la esfera ");
		int terminado = 0;
		int intentos = 0;
		this.radio = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el radio valdra " + radio);
		area = df.format(4 * Math.PI * Math.pow(this.radio, 2));
		logMenaje(rutaLog, " Con estos datos el area sera igual a " + area);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el area de una esfera con radio igual a: " + radio);
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
						System.out.println("El área de la superficie de la esfera equivale a sus cuatro radios al cuadrado multiplicados por el número π.");
						System.out.println("Fórmula para calcular el área de esfera: A = 4*Pi*R²\n");
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
	 * */
	public void calcularVolumen() {
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el volumen de la esfera ");
		int terminado = 0;
		int intentos = 0;
		this.radio = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el radio valdra " + radio);
		volumen = df.format((4 * Math.PI * Math.pow(this.radio, 3)) / 3);
		logMenaje(rutaLog, " Con estos datos el volumen sera igual a " + volumen);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el volumen de una esfera con radio igual a: " + radio);
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
						System.out.println("Oh no has fallado debes intentarlo de nuevo y intentando aplicar la siguiente formula\n");
						logMenaje(rutaLog, " El alumno ha fallado la respuesta y debera proponer una nueva respuesta");
						System.out.println("El volumen de una esfera es igual a 4/3 por PI por el radio al cubo");
						System.out.println("Formula para calcular el volumen de esfera: V = 4*Pi*R³\n");
					}
				}
			}catch(CustomException e) {
				System.out.println("error" + e.getMessage());	
			}
		}while (bError);
		System.out.println("Lo has logrado en " + intentos + " intentos.\n\n");
	}
}
