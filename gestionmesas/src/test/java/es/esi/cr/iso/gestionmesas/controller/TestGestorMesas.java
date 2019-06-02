package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import es.esi.cr.iso.gestionmesas.controller.GestorMesas;
import es.esi.cr.iso.gestionmesas.persistency.ServicioDao;
import es.esi.cr.iso.gestionmesas.model.Servicio;

public class TestGestorMesas {
	
	private GestorMesas gm;
	private ServicioDao gdao;

	@Before
	public void setUp() throws Exception {
		gm = new GestorMesas();
		gdao = new ServicioDao();
	}
	
/*----------------------------------------------------------------------------------------------*
 *																								*
 *  					TEST CASES FOR METHOD: definirServicio						  			*
 *   																							*
 *----------------------------------------------------------------------------------------------*/

	@Test
	public void TestDefinirServicio_1() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
	
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	@Test
	public void TestDefinirServicio_2() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		gm.setFechaServicio(date);
		gm.setComidaServicio(false);
		gm.setTurnoServicio(1);
		
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirServicio_3() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(2);
		
		try {
			gm.definirServicio();
		}catch(Exception e) {
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirServicio_4() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		gm.setFechaServicio(date);
		gm.setComidaServicio(false);
		gm.setTurnoServicio(10);
		
		try {
			gm.definirServicio();
			fail("Error expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirServicio_5() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(-5);
		
		try {
			gm.definirServicio();
			fail("Error expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	
/*----------------------------------------------------------------------------------------------*
 *																								*
 *  					TEST CASES FOR METHOD: definirEstado						  			*
 *   																							*
 *----------------------------------------------------------------------------------------------*/
	
	@Test
	public void TestDefinirEstado_1() throws ParseException
	{
		int[] vectorEstados = {0,0,0,0,0,0,0,0};
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gm.setUltimoEstadoMesa(vectorEstados);
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
		gm.setServicioDao(gdao);
		
		try {
			gm.definirServicio();
			gm.definirEstado(-15,-10);
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirEstado_2() throws ParseException
	{
		int[] vectorEstados = {0,0,0,0,0,0,0,0};
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gm.setUltimoEstadoMesa(vectorEstados);
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
		gm.setServicioDao(gdao);
		
		try {
			gm.definirServicio();
			gm.definirEstado(4,7);
		}catch(Exception e){
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirEstado_3() throws ParseException
	{
		int[] vectorEstados = {0,0,0,0,0,0,0,0};
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gm.setUltimoEstadoMesa(vectorEstados);
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
		gm.setServicioDao(gdao);
		
		try {
			gm.definirServicio();
			gm.definirEstado(4,7);
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDefinirEstado_4() throws ParseException
	{
		int[] vectorEstados = {0,0,0,0,0,0,0,0};
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gm.setUltimoEstadoMesa(vectorEstados);
		gm.setFechaServicio(date);
		gm.setComidaServicio(true);
		gm.setTurnoServicio(0);
		gm.setServicioDao(gdao);
		
		try {
			gm.definirServicio();
			gm.definirEstado(20,10);
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
/*----------------------------------------------------------------------------------------------*
 *																								*
 *  					TEST CASES FOR METHOD: getStyleClass									*
 *																								*
 *----------------------------------------------------------------------------------------------*/


	@Test
    public void TestGetStyleClass_1()
    {
        int[] vectorEstados = {0,0,8,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(3,0);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void TestGetStyleClass_2()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(1,6);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void TestGetStyleClass_3()
    {
        int[] vectorEstados = {0,0,0,0,0,0,0,2};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(8,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }

    @Test
    public void TestGetStyleClass_4()
    {
        int[] vectorEstados = {6,0,0,0,0,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(1,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void TestGetStyleClass_5()
    {
        int[] vectorEstados = {0,0,0,0,0,7,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(6,3);
        String expected = "estado-pasado";
        assertEquals(obtained, expected);
    }

    @Test
    public void TestGetStyleClass_6()
    {
        int[] vectorEstados = {0,0,0,0,1,0,0,0};
        gm.setUltimoEstadoMesa(vectorEstados);
        String obtained = gm.getStyleClass(5,4);
        String expected = "estado-futuro";
        assertEquals(obtained, expected);
    }
   
/*----------------------------------------------------------------------------------------------*
*																								*
*  					TEST CASES FOR METHOD: isEnabled											*
*																								*
*-----------------------------------------------------------------------------------------------*/
	@Test
	public void testIsEnabled_1() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		boolean esperado = true;
		boolean obtenido = gm.isEnabled(1, 0);
		assertEquals(esperado, obtenido);
	}
	
	
	@Test
	public void testIsEnabled_2() throws Exception {
		int[] ultimoEstadoMesa = {8,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		boolean esperado = false;
		boolean obtenido = gm.isEnabled(1, 1);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabled_3() throws Exception {
		int[] ultimoEstadoMesa = {3,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
		
		
		Servicio servicio = new Servicio();
		gm.setServicioActivo(servicio);
		
		boolean esperado = true;
		boolean obtenido = gm.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testIsEnabled_4() throws Exception {
		int[] ultimoEstadoMesa = {6,0,0,0,0,0,0,0,0};
		gm.setUltimoEstadoMesa(ultimoEstadoMesa);
	
		
		boolean esperado = false;
		boolean obtenido = gm.isEnabled(1, 5);
		assertEquals(esperado, obtenido);
	}
	
}
