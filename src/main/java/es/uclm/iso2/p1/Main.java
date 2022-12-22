package es.uclm.iso2.p1;

/**
 * Clase Main para comprobar el método
 */
public class Main {

	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		Fecha fecha = new Fecha(1,12,2020);
		try {
			if(fecha.esBisiesto(fecha)) {
				System.out.println("El año es bisiesto");
			}else {
				System.out.println("El año no es bisiesto");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
