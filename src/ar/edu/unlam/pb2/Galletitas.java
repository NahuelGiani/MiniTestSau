package ar.edu.unlam.pb2;

public class Galletitas extends Comestible {

	private String descripcion;
	private Integer cantidad;
	private Double precio;
	private String marca;

	public Galletitas(int i, String string, String string2, String string3, String string4, double d) {
		super(i, string3);

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String producto) {
		this.descripcion = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void add(Galletitas galletitas) {

	}

}
