package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private Integer cantidad;
	private String descripcion;
	private Double kilos;
	private String marca;
	private Double precio;

	public Carne(int cantidad2, String descripcion2, String string, String string2, double kilos2, String marca2, double precio2) {
		super(string, string2);
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void add(Carne carne) {
		
		
	}

}
