package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienIA {
	
	@Test
	public void testTamanioMinimoExacto() {

		Alien alien = new Alien(5, "Verde");

		assertEquals(5, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
	}

	@Test
	public void testTamanioMaximoExacto() {

		Alien alien = new Alien(30, "Azul");

		assertEquals(30, alien.getTamanio());
		assertEquals("Azul", alien.getColor());
	}

	@Test
	public void testTamanioMenorAlMinimo() {

		Alien alien = new Alien(1, "Rojo");

		assertEquals(5, alien.getTamanio());
	}

	@Test
	public void testTamanioMayorAlMaximo() {

		Alien alien = new Alien(50, "Morado");

		assertEquals(30, alien.getTamanio());
	}

	@Test
	public void testPreciosConTamanioMinimo() {

		Alien alien = new Alien(5, "Amarillo");

		assertEquals(1.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.0001);
	}

	@Test
	public void testPreciosConTamanioMaximo() {

		Alien alien = new Alien(30, "Negro");

		assertEquals(6.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(3.0, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.0001);
	}

}
