package es.uclm.iso2.p1;

import java.util.InputMismatchException;

public class Fecha {
  private int dia;
  private int mes;
  private int anio;
  
  public Fecha () {}  
  
  public Fecha(int dia, int mes, int anio) {
	  this.setDia(dia);
	  this.setMes(mes);
	  this.setAnio(anio);
  }
  
  
  public void setDia(int dia) throws InputMismatchException{
	  if(dia < 1 || dia > 31) {
		  throw new InputMismatchException("El día ser un valor entre 1 y 31");
	  }
	  this.dia = dia;
  }
  
  public void setMes(int mes) throws InputMismatchException{
	  if(mes < 1 || mes > 12) {
		  throw new InputMismatchException("El mes ser un valor entre 1 y 12");
	  }
	  this.mes = mes;
  }
  
  public void setAnio(int anio) throws InputMismatchException{
	  if(anio < 0) {
		  throw new InputMismatchException("El año no es válido");
	  }
	  this.anio = anio;
  }
  
  public boolean esBisiesto(Fecha fecha) throws Exception {
	  boolean bisiesto = false;
	  try {
		  if((fecha.getAnio() % 4 == 0 && fecha.getAnio() % 100 != 0) || (fecha.getAnio() % 400 == 0)) {
			  bisiesto = true;
		  }
	  }catch(Exception e) {
		  throw new Exception("Se ha producido un error con la fecha introducida");
	  }
	  
	  return bisiesto;
  }

  public int getDia() {
	  return dia;
  }
	
  public int getMes() {
	  return mes;
  }
	
  public int getAnio() {
	  return anio;
  }
  
}
