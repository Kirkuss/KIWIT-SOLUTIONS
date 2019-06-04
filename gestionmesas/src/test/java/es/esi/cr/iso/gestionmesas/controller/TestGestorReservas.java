package es.esi.cr.iso.gestionmesas.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGestorReservas {

	private GestorReservas gestor;
	
	@BeforeEach
	public void setUp() throws Exception {
		gestor = new GestorReservas();
	}

	@Test
	public void testRealizarReserva1() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaReserva(date);
		gestor.setComidaReserva(false);
		gestor.setTurnoReserva(0);
		gestor.setMesaReserva(-2);
		gestor.setNombreReserva("Reserva de Daniel");
		
		try {
			gestor.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva2() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaReserva(date);
		gestor.setComidaReserva(true);
		gestor.setTurnoReserva(1);
		gestor.setMesaReserva(2);
		gestor.setNombreReserva("Reserva de Raquel");
		
		try {
			gestor.realizarReserva();
		}catch(Exception e) {
			fail("The error was not expected");
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva3() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaReserva(date);
		gestor.setComidaReserva(false);
		gestor.setTurnoReserva(2);
		gestor.setMesaReserva(10);
		gestor.setNombreReserva(null);
		
		try {
			gestor.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva4() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaReserva(date);
		gestor.setComidaReserva(true);
		gestor.setTurnoReserva(20);
		gestor.setMesaReserva(0);
		gestor.setNombreReserva("Reserva de Enrique");
		
		try {
			gestor.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealizarReserva5() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy", java.util.Locale.getDefault());
		Date date = format.parse("29-05-2019");
		
		gestor.setFechaReserva(date);
		gestor.setComidaReserva(false);
		gestor.setTurnoReserva(-5);
		gestor.setMesaReserva(4);
		gestor.setNombreReserva("Reserva de Samuel");
		
		try {
			gestor.realizarReserva();
			fail("An error was expected");
		}catch(Exception e) {
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());
			e.printStackTrace();
		}
	}
	
}
