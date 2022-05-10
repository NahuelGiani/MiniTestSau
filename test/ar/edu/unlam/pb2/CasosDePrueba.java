package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CasosDePrueba {

	@Test
	public void queSePuedaInstanciarUnComestible() {
		Comestible producto = new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0);

		assertEquals("Cerealitas", ((Galletitas)producto).getDescripcion());
		assertEquals("22/06/2021", producto.getFechaDeElaboracion());
		assertEquals("31/01/2022", producto.getFechaDeVencimiento());
		assertEquals("Arcor", ((Galletitas)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtroComestible() {
		Comestible producto = new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0);
		
		assertEquals("Tapa de nalga", ((Carne)producto).getDescripcion());
		assertEquals("07/07/2021", producto.getFechaDeElaboracion());
		assertEquals("15/07/2021", producto.getFechaDeVencimiento());
		assertEquals(2.0, ((Carne)producto).getKilos(), 0.1);
	}
	
	@Test
	public void queSePuedaInstanciarUnElectrodomestico() {
		Electrodomestico producto = new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0);
		
		assertEquals("Serie Dorada", ((Televisor)producto).getDescripcion());
		assertEquals((Integer)42, ((Televisor)producto).getPulgadas());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Televisor)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtroElectrodomestico() {
		Electrodomestico producto = new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0);
		
		assertEquals("Nuevo Modelo", ((Heladera)producto).getDescripcion());
		assertEquals(true, ((Heladera)producto).isNoFrost());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Heladera)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarUnaIndumentaria() {
		Indumentaria producto = new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0);
		
		assertEquals("Básica", ((Remera)producto).getDescripcion());
		assertEquals("XL", producto.getTalle());
		assertEquals("Lacoste", ((Remera)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtraIndumentaria() {
		Indumentaria producto = new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0);
		
		assertEquals("De running", ((Zapatilla)producto).getDescripcion());
		assertEquals("42", producto.getTalle());
		assertEquals("Blancas", producto.getColor());
		assertEquals("Nike", ((Zapatilla)producto).getMarca());
	}
	
}
