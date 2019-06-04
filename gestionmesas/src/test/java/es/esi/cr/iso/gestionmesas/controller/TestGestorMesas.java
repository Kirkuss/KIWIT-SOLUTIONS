package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.esi.cr.iso.gestionmesas.controller.GestorMesas;
import es.esi.cr.iso.gestionmesas.model.Servicio;
import es.esi.cr.iso.gestionmesas.model.Transaccion;

public class TestGestorMesas {

	private GestorMesas gm;
	
	@BeforeEach
	public void setUp() throws Exception {
		gm = new GestorMesas();
	}

	@Test
	public void testDefinirServicio_1() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
		
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio_2() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(false);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio_3() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(2);
		
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio_4() throws ParseException {
	
		gm.setFechaServicio(null);
		gm.setComidaServicio(false);
		gm.setTurnoServicio(10);
		
		try {
			gm.definirServicio();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirServicio_5() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(-5);
		
		try {
			gm.definirServicio();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado_1() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
			gm.definirEstado(-5,-10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado_2() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
			gm.definirEstado(4,7);
		}catch (Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirEstado_3() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
			gm.definirEstado(20,7);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado_4() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
			gm.definirEstado(0,10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testDefinirEstado_5() throws ParseException {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
			gm.definirEstado(5,10);
			fail("An error was expected");
		}catch (Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass_1() {
		int [] vectorEstados = {-10,-10,-10,-10,-10,-10,-10,-10};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gm.getStyleClass(-20, -5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetStyleClass_2() {
		int [] vectorEstados = {0,5,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gm.getStyleClass(2, 0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass_3() {
		int [] vectorEstados = {10,10,10,10,10,10,10,10};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gm.getStyleClass(15, 5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass_4() {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gm.getStyleClass(1, -5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStyleClass_5() {
		int [] vectorEstados = {0,0,0,0,8,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		try {
			gm.getStyleClass(5, 0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
	public void testIsEnabled_1() {
		int [] vectorEstados = {-10,-10,-10,-10,-10,-10,-10,-10};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		try {
			gm.isEnabled(-2,-5);
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled_2() {
		int [] vectorEstados = {0,5,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		try {
			gm.isEnabled(1,0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled_3() {
		int [] vectorEstados = {10,10,10,10,10,10,10,10};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		try {
			gm.isEnabled(6,5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled_4() {
		int [] vectorEstados = {0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		try {
			gm.isEnabled(1,0);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsEnabled_5() {
		int [] vectorEstados = {0,0,0,0,8,0,0,0};
		gm.setUltimoEstadoMesa(vectorEstados);
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		try {
			gm.isEnabled(5,-5);
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}

	@Test
    public void testGetStyleClass_cd1()
    {
        int[] vectorEstados = {0,0,8,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(3,0);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClass_cd2()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(1,6);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClass_cd3()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,2};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(8,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClass_cd4()
    {
        int[] vectorEstados = {6,0,0,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(1,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClass_cd5()
    {
        int[] vectorEstados = {0,0,0,0,0,7,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(6,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void testGetStyleClass_cd6()
    {
        int[] vectorEstados = {0,0,0,0,1,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(5,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }
   
	@Test
	public void testIsEnabled_cd1() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
	
		boolean esperado = true;
		boolean obtenido = gm.isEnabled(1, 0);
		assertEquals(esperado, obtenido);
	}
	
	
	@Test
	public void testIsEnabled_cd2() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		boolean esperado = false;
		boolean obtenido = gm.isEnabled(1, 1);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabled_cd3() throws Exception {
		int[] ultimoEstadoMesa = {3,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		boolean esperado = true;
		boolean obtenido = gm.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabled_cd4() throws Exception {
		int[] ultimoEstadoMesa = {6,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
	
		
		boolean esperado = false;
		boolean obtenido = gm.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
}
