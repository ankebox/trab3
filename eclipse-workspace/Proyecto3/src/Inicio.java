import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {
	static Scanner sn = new Scanner (System.in);
	public static String rutaLog = "log.txt";
	/**
	 * Metodo principal para el correcto funcionamiento del programa
	 * */
	public static void main(String[] args) {
		boolean salir = false;
		int opcion;
		Boolean bError = true;
		do {
			try {
				while(!salir) {
					System.out.println("1. Area de un circulo ");
					System.out.println("2. Volumen de un circulo");
					System.out.println("3. Area de un cubo");
					System.out.println("4. Volumen de un cubo");
					System.out.println("5. Area de una cono");
					System.out.println("6. Volumen de un cono");
					System.out.println("7. salir\n");
					System.out.println("Juego de Volumenes y areas");
					opcion = sn.nextInt();
					switch(opcion) {
					case 1: 
						Esfera esf = new Esfera();
						esf.calcularArea();
						salir = true;
						bError = false;
						break;
					case 2: 
						Esfera esf1 = new Esfera();
						esf1.calcularVolumen();
						salir = true;
						bError = false;
						break;
					case 3: 
						Cubo cub = new Cubo();
						cub.calcularArea();
						salir = true;
						bError = false;
						break;
					case 4: 
						Cubo cub1 = new Cubo();
						cub1.calcularVolumen();
						salir = true;
						bError = false;
						break;
					case 5: 
						Cono con = new Cono();
						con.calcularArea();
						salir = true;
						bError = false;
						break;
					case 6: 
						Cono con1 = new Cono();
						con1.calcularVolumen();
						salir = true;
						bError = false;
						break;
					case 7: 
						System.out.println("Se sale");
						salir = true;
						bError = false;
						break;
					default:
						System.out.println("Las Opciones son entre 1 y 7");
					}
				}
			}catch(InputMismatchException e) {
				System.out.println("No puedes introducir letras para elegir una opcion debes introducir un numero del 1 al 7");	
				sn.nextLine();
			}
		}while (bError);
	}
}
