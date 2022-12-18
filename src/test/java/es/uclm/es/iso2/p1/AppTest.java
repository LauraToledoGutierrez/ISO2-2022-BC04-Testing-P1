package es.uclm.es.iso2.p1;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Assert;
import org.junit.Test;

import es.uclm.iso2.p1.Fecha;

public class AppTest {
	
	@Test
	public void testGetMes() {
		Fecha date = new Fecha(11,2,2020);
		assertTrue(date.getMes() > 0);
	}
	
	@Test
	public void testGetDia() {
		Fecha date = new Fecha(5,5,2010);
		assertTrue(date.getDia() == 5);
    }
	
	@Test
	public void testGetAnio() {
		Fecha date = new Fecha(21,11,2010);
		assertTrue(date.getAnio() == 2010);
	}
	
	
	@Test
	public void testSetDia() {
		Fecha date = new Fecha();
		int dia = 2;
		date.setDia(dia);
	}
	
	
	@Test (expected = InputMismatchException.class)
	public void testSetDiaFail() {
		Fecha date = new Fecha();
		int dia = 36;
		date.setDia(dia);
	}
	
	
	@Test
	public void testSetMes() {
		Fecha date = new Fecha();
		int mes = 6;
		date.setMes(mes);
	}
	
	@Test (expected = InputMismatchException.class)
	public void testSetMesFail() {
		Fecha date = new Fecha();
		int mesF = 28;
		date.setMes(mesF);
	}
	
	@Test
	public void testSetAnio() {
		Fecha date = new Fecha();
		int anio = 2010;
		date.setAnio(anio);
	}
	
	@Test (expected = InputMismatchException.class)
	public void testSetAnioFail() {
		Fecha date = new Fecha();
		int anioF = -1;
		date.setAnio(anioF);
	}
	
	@Test
	public void testNoEsBisiesto(){
		Fecha date = new Fecha(21,11,2010);
		try {
			assertEquals(false,date.esBisiesto(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEsBisiesto() {
		Fecha date = new Fecha(21,11,2020);
		try {
			assertEquals(true,date.esBisiesto(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
