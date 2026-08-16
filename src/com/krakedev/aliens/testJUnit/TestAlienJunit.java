package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJunit {

	@Test
	public void testAsignacionAtributos() {

		Alien alien = new Alien(10, "Verde");

		assertEquals(10, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
	}

	@Test
	public void testRestriccionTamanio() {

		Alien alienPequenio = new Alien(2, "Rojo");
		Alien alienGrande = new Alien(40, "Azul");

		assertEquals(5, alienPequenio.getTamanio());
		assertEquals(30, alienGrande.getTamanio());
	}

	@Test
	public void testCalculoPrecios() {

		Alien alien = new Alien(20, "Morado");

		assertEquals(4.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(2.0, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1.0, alien.getPrecioOjo(), 0.0001);
	}

	@Test
	public void testAgregarBrazosValido() {

		Alien alien = new Alien(10, "Verde");

		boolean resultado = alien.agregarBrazos(4);

		assertEquals(true, resultado);
		assertEquals(4, alien.getNumeroBrazos());
	}
	
	@Test
	public void testLimiteExtremidades() {

		Alien alien = new Alien(10, "Azul");

		boolean resultado = alien.agregarBrazos(10);

		assertEquals(true, resultado);
		assertEquals(10, alien.getNumeroBrazos());
	}
	
	@Test
	public void testExtremidadesCombinadas() {

		Alien alien = new Alien(10, "Rojo");

		boolean brazos = alien.agregarBrazos(4);
		boolean piernas = alien.agregarPiernas(6);

		assertEquals(true, brazos);
		assertEquals(true, piernas);
		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(6, alien.getNumeroPies());
	}
	
	@Test
	public void testExcedeLimiteExtremidades() {

		Alien alien = new Alien(10, "Morado");

		alien.agregarBrazos(6);

		boolean resultado = alien.agregarPiernas(5);

		assertEquals(false, resultado);
		assertEquals(6, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}
	
	@Test
	public void testAgregarOjosValido() {

		Alien alien = new Alien(10, "Verde");

		boolean resultado = alien.agregarOjos(3);

		assertEquals(true, resultado);
		assertEquals(3, alien.getNumeroOjos());
	}
	
	@Test
	public void testExcedeLimiteOjos() {

		Alien alien = new Alien(10, "Azul");

		boolean resultado = alien.agregarOjos(4);

		assertEquals(false, resultado);
		assertEquals(0, alien.getNumeroOjos());
	}
	
	@Test
	public void testCalcularPrecioTotal() {

		Alien alien = new Alien(10, "Verde");

		alien.agregarBrazos(2);
		alien.agregarPiernas(2);
		alien.agregarOjos(3);

		assertEquals(7.5, alien.getPrecioTotal(), 0.0001);
	}
	
	@Test
	public void testActualizacionAutomaticaPrecioTotal() {

		Alien alien = new Alien(10, "Azul");

		alien.agregarBrazos(2);
		assertEquals(4.0, alien.getPrecioTotal(), 0.0001);

		alien.agregarPiernas(2);
		assertEquals(6.0, alien.getPrecioTotal(), 0.0001);

		alien.agregarOjos(2);
		assertEquals(7.0, alien.getPrecioTotal(), 0.0001);
	}
	
	

}
