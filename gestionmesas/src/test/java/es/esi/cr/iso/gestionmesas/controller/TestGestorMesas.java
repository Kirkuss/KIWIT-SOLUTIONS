package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.esi.cr.iso.gestionmesas.model.Servicio;

public class TestGestorMesas {

	private GestorMesas gestor;
	
	@BeforeEach
	public void setUp() throws Exception {
		gestor = new GestorMesas();
	}
	
	@Test
	public void testDefinirServicio1() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(0);
		
		try {
			gestor.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio2() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(false);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio3() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(2);
		
		try {
			gestor.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio4() throws ParseException {
	
		gestor.setFechaServicio(null);
		gestor.setComidaServicio(false);
		gestor.setTurnoServicio(10);
		
		try {
			gestor.definirServicio();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio5() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(-5);
		
		try {
			gestor.definirServicio();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado1() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
			gestor.definirEstado(-5,-10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado2() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
			gestor.definirEstado(4,7);
		}catch (Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirEstado3() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
			gestor.definirEstado(20,7);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado4() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
			gestor.definirEstado(0,10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado5() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaServicio(date);
		gestor.setComidaServicio(true);
		gestor.setTurnoServicio(1);
		
		try {
			gestor.definirServicio();
			gestor.definirEstado(5,10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass1() {
		int [] vectorEstados = {-10,-10,-10,-10,-10,-10,-10,-10};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gestor.getStyleClass(-20, -5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetStyleClass2() {
		int [] vectorEstados = {0,5,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gestor.getStyleClass(2, 0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass3() {
		int [] vectorEstados = {10,10,10,10,10,10,10,10};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gestor.getStyleClass(15, 5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass4() {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gestor.getStyleClass(1, -5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass5() {
		int [] vectorEstados = {0,0,0,0,8,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gestor.getStyleClass(5, 0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testIsEnabled1() {
		int [] vectorEstados = {-10,-10,-10,-10,-10,-10,-10,-10};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		try {
			gestor.isEnabled(-2,-5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled2() {
		int [] vectorEstados = {0,5,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		try {
			gestor.isEnabled(1,0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled3() {
		int [] vectorEstados = {10,10,10,10,10,10,10,10};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		try {
			gestor.isEnabled(6,5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled4() {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		try {
			gestor.isEnabled(1,0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled5() {
		int [] vectorEstados = {0,0,0,0,8,0,0,0};
		gestor.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		try {
			gestor.isEnabled(5,-5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
    public void testGetStyleClasscd1()
    {
        int[] vectorEstados = {0,0,8,0,0,0,0,0};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(3,0);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClasscd2()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,0};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(1,6);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClasscd3()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,2};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(8,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClasscd4()
    {
        int[] vectorEstados = {6,0,0,0,0,0,0,0};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(1,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClasscd5()
    {
        int[] vectorEstados = {0,0,0,0,0,7,0,0};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(6,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClasscd6()
    {
        int[] vectorEstados = {0,0,0,0,1,0,0,0};
        gestor.setUltimoEstadoMesa(vectorEstados);
        String obtained = gestor.getStyleClass(5,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }
   
	@Test
	public void testIsEnabledcd1() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
	
		boolean esperado = true;
		boolean obtenido = gestor.isEnabled(1, 0);
		assertEquals(esperado, obtenido);
	}
	
	
	@Test
	public void testIsEnabledcd2() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		boolean esperado = false;
		boolean obtenido = gestor.isEnabled(1, 1);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabledcd3() throws Exception {
		int[] ultimoEstadoMesa = {3,0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gestor.setServicioActivo(servicio);
		
		boolean esperado = true;
		boolean obtenido = gestor.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabledcd4() throws Exception {
		int[] ultimoEstadoMesa = {6,0,0,0,0,0,0,0,0};
		gestor.setUltimoEstadoMesa(ultimoEstadoMesa);
	
		
		boolean esperado = false;
		boolean obtenido = gestor.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
}
