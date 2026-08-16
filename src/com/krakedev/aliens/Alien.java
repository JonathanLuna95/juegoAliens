package com.krakedev.aliens;

public class Alien {

	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;

	public Alien(int tamanio, String color) {

		this.color = color;

		if (tamanio >= 5 && tamanio <= 30) {
			this.tamanio = tamanio;
		} else if (tamanio < 5) {
			this.tamanio = 5;
		} else {
			this.tamanio = 30;
		}

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public void imprimir() {
		System.out.println("Tamaño: " + tamanio);
		System.out.println("Color: " + color);
		System.out.println("Número de ojos: " + numeroOjos);
		System.out.println("Número de brazos: " + numeroBrazos);
		System.out.println("Número de pies: " + numeroPies);
		System.out.println("Precio extremidad: " + precioExtremidad);
		System.out.println("Precio ojo: " + precioOjo);
		System.out.println("Precio cuerpo: " + precioCuerpo);
	}

	public boolean agregarBrazos(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10) {
			numeroBrazos = numeroBrazos + cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean agregarPiernas(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10) {
			numeroPies = numeroPies + cantidad;
			return true;
		} else {
			return false;
		}
	}

}
