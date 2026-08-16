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

}
