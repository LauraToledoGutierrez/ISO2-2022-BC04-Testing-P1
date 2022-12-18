package es.uclm.es.iso2.p1;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testSetDiaFail() {
		Fecha date = new Fecha();
		int dia = 36;
		exceptionRule.expect(InputMismatchException.class);
		date.setDia(dia);
	}
	
	
	@Test
	public void testSetMes() {
		try {
			Fecha date = new Fecha();
			int mes = 6;
			date.setMes(mes);
		}catch(Exception ex) {
			Assert.fail("Se ha producido una excepción");
		}
	}
	
	@Test
	public void testSetMesFail() {
		Fecha date = new Fecha();
		int mes = 28;
		exceptionRule.expect(InputMismatchException.class);
		date.setMes(mes);
	}
	
	@Test
	public void testSetAnio() {
		try {
			Fecha date = new Fecha();
			int anio = 2;
			date.setAnio(anio);
		}catch(Exception ex) {
			Assert.fail("Se ha producido una excepción");
		}
	}
	
	@Test
	public void testSetMesAnio() {
		Fecha date = new Fecha();
		int anio = 28;
		exceptionRule.expect(InputMismatchException.class);
		date.setMes(anio);
	}
	
	@Test
	public void testNoEsBisiesto() throws Exception {
		Fecha date = new Fecha(21,11,2010);
		assertEquals(false,date.esBisiesto(date));
	}
	
	@Test
	public void testEsBisiesto() throws Exception {
		Fecha date = new Fecha(21,11,2020);
		assertEquals(true,date.esBisiesto(date));
	}
	
	
}
