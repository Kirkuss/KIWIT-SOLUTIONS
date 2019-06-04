package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.esi.cr.iso.gestionmesas.controller.GestorReservas;

public class TestGestorReservas {

	private GestorReservas gr;
	
	@BeforeEach
	public void setUp() throws Exception {
		gr = new GestorReservas();
	}

	@Test
	public void testRealizarReserva_1() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(0);
		gr.setMesaReserva(-2);
		gr.setNombreReserva("Reserva de Daniel");
		
		try {
			gr.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva_2() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(1);
		gr.setMesaReserva(2);
		gr.setNombreReserva("Reserva de Raquel");
		
		try {
			gr.realizarReserva();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva_3() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(2);
		gr.setMesaReserva(10);
		gr.setNombreReserva(null);
		
		try {
			gr.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva_4() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date date = format.parse("29-05-2019");
		
		gr.setFechaReserva(date);
		gr.setComidaReserva(true);
		gr.setTurnoReserva(20);
		gr.setMesaReserva(0);
		gr.setNombreReserva("Reserva de Enrique");
		
		try {
			gr.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva_5() throws ParseException {
		
		gr.setFechaReserva(null);
		gr.setComidaReserva(false);
		gr.setTurnoReserva(-5);
		gr.setMesaReserva(4);
		gr.setNombreReserva("Reserva de Samuel");
		
		try {
			gr.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
}
