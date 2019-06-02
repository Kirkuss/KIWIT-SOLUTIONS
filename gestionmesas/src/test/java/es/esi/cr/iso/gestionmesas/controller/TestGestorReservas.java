package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import es.esi.cr.iso.gestionmesas.controller.GestorReservas;

public class TestGestorReservas {

	private GestorReservas gr;
	
	@Before
	public void setUp() throws Exception
	{
		gr = new GestorReservas();
	}
	
	@Test
	void TestRealizarReserva_1() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(5);
		gr.setMesaReserva(-2);
		gr.setNombreReserva(null);
		 
		try {
		
			gr.realizarReserva();
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	
	@Test
	void TestRealizarReserva_2() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(5);
		gr.setMesaReserva(2);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();
			fail("Error expected");
		}catch(Exception e){		
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	
	@Test
	void TestRealizarReserva_3() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(2);
		gr.setMesaReserva(4);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();	
		}catch(Exception e){
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	
	@Test
	void TestRealizarReserva_4() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(3);
		gr.setMesaReserva(10);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();	
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	
	@Test
	void TestRealizarReserva_5() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(5);
		gr.setMesaReserva(-2);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();	
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}

	@Test
	void TestRealizarReserva_6() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(5);
		gr.setMesaReserva(1);
		gr.setNombreReserva(null);
		 
		try {
		
			gr.realizarReserva();	
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	@Test
	void TestRealizarReserva_7() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(0);
		gr.setMesaReserva(3);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();	
		}catch(Exception e){
			fail("Error expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
	@Test
	void TestRealizarReserva_8() throws ParseException
	{
		gr = new GestorReservas();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(1);
		gr.setMesaReserva(15);
		gr.setNombreReserva("Tables");
		 
		try {
		
			gr.realizarReserva();	
			fail("Error expected");
		}catch(Exception e){
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
		
	}
}
