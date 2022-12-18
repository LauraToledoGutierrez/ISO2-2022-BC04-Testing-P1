package es.uclm.iso2.p1;

public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(-1,12,2020);
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
