public class Cono extends Figura {

	private double radio;
	private double H;
	private double lado;
	private String area;
	private String volumen;
	private Boolean bError;

	public Cono() {
		this.bError = true;
	}
	
	/**
	 * Metodo para calcular el area 
	 * */
	public void calcularArea(){
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el area del cono ");
		int terminado = 0;
		int intentos = 0;
		radio = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el radio valdra " + radio);
		lado = (int)(Math.random()*15.0 + 5.0); 
		logMenaje(rutaLog, " Se ha determinado que el lado valdra " + lado);
		area = df.format((Math.PI*radio*lado)+(Math.PI*(radio*radio)));
		logMenaje(rutaLog, " Con estos datos el area sera igual a " + area);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el area de un cono con radio igual a: " + radio + "\n y lado igual a: " + lado);
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
						System.out.println("El área de la superficie de un cono equivale a multiplicar Pi por su radio al cuadrado y sumarlo mas Pi por radio por lado");
						System.out.println("Fórmula para calcular el área de un cono: A = Pi*R*R+Pi*R*L");
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
	public void calcularVolumen(){
		logs();
		logMenaje(rutaLog, " El alumno ha empezado a jugar a hallar el volumen del cono ");
		int terminado = 0;
		int intentos = 0;
		radio = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que el radio valdra " + radio);
		H  = (int)(Math.random()*10.0 + 1.0); 
		logMenaje(rutaLog, " Se ha determinado que la altura valdra " + H);
		volumen = df.format((Math.PI*(radio*radio)*H)/3);
		logMenaje(rutaLog, " Con estos datos el volumen sera igual a " + volumen);
		do {
			try {
				while (terminado == 0) {
					String respuesta ; 
					System.out.println("Calcula el volumen de un cono con radio igual a: " + radio + "\n y altura igual a: " + H);
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
						System.out.println("El volumen de un cono es igual a 1/3 mutiplicado por Pi por su radio al cuadrado por su altura");
						System.out.println("Formula para calcular el volumen de un cono: V = 1/3*Pi*Pi*H");
					}
				}
			}catch(CustomException e) {
				System.out.println("error" + e.getMessage());	
			}
		}while (bError);
		System.out.println("Lo has logrado en " + intentos + " intentos.\n\n");
	}
}
