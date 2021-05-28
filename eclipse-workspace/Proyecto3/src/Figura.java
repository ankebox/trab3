import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;
	
public abstract class Figura {
	
	String rutaLog = "log.txt";
	public static Scanner sn = new Scanner (System.in);
	public abstract void calcularArea();
	public abstract void calcularVolumen();
	DecimalFormat df = new DecimalFormat("#.00"); // Esto sirve para que el numero solo tenga formato de dos numeros
	MiHelper h = new MiHelper();
	
	
	
	public void logs() {

		String fecha = new SimpleDateFormat("ddMMyyyy-HHmm").format(new Date());
		rutaLog = ("log\\" + fecha + "-" + "log.txt");
		File f = new File(rutaLog);
		f.getParentFile().mkdirs();
		FileWriter fw;
		PrintWriter pw = null ;
		try {
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}
	
	public static void logMenaje(String rutaArchivo, String mensaje) {
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter(rutaArchivo, true);
			pw = new PrintWriter(fw);
		pw.println(new Date() + mensaje);
		}catch (IOException e) {
      e.printStackTrace();
        }
		pw.close();
	}
}
