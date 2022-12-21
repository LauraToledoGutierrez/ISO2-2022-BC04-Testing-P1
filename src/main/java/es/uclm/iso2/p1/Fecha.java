package es.uclm.iso2.p1;

import java.util.InputMismatchException;

/**
 * Clase que representa
 * una fecha con parámetros
 * como el día,mes y año
 */
public class Fecha {
	
  /**
   * Atributo entero que representa el día	
   */
  private int dia;
  /**
   * Atributo que representa el mes
   */
  private int mes;
  /**
   * Atributo que representa el año
   */
  private int anio;
  
  /**
   * Constructor de la clase
   * sin parámetros
   */
  public Fecha () {}  
  
  /**
   * Contructor dado los siguientes métodos
   * @param dia
   * @param mes
   * @param anio
   */
  public Fecha(int dia, int mes, int anio) {
	  this.setDia(dia);
	  this.setMes(mes);
	  this.setAnio(anio);
  }
  
  /**
   * Setter para establecer el día
   * @param dia
   * @throws InputMismatchException
   */
  public void setDia(int dia) throws InputMismatchException{
	  if(dia < 1 || dia > 31) {
		  throw new InputMismatchException("El día ser un valor entre 1 y 31");
	  }
	  this.dia = dia;
  }
  
  /**
   * Setter para establecer el mes
   * @param mes
   * @throws InputMismatchException
   */
  public void setMes(int mes) throws InputMismatchException{
	  if(mes < 1 || mes > 12) {
		  throw new InputMismatchException("El mes ser un valor entre 1 y 12");
	  }
	  this.mes = mes;
  }
  
  /**
   * Setter para establecer el año
   * @param anio
   * @throws InputMismatchException
   */
  public void setAnio(int anio) throws InputMismatchException{
	  if(anio < 0) {
		  throw new InputMismatchException("El año no es válido");
	  }
	  this.anio = anio;
  }
  
  /**
   * Método que comprueba si una 
   * fecha dada el año es bisiesto
   * @param fecha
   * @return
   * @throws Exception
   */
  public boolean esBisiesto(Fecha fecha) throws Exception {
	  boolean bisiesto = fecha.getAnio() % 4 == 0 && fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 == 0;
	  return bisiesto;
  }

  /**
   * Getter para obtener el dia
   * @return dia de un objeto Fecha
   */
  public int getDia() {
	  return dia;
  }

  /**
   * Getter para obtener el mes
   * @return mes de un objeto Fecha
   */
  public int getMes() {
	  return mes;
  }

  /**
   * Getter para obtener el año
   * @return año de un objeto Fecha
   */
  public int getAnio() {
	  return anio;
  }
  
}
