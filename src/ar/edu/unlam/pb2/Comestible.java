package ar.edu.unlam.pb2;

public abstract class Comestible {

	protected String fechaDeElaboracion;
	protected String fechaDeVencimiento;

	protected Comestible(String fechaDeElaboracion, String fechaDeVencimiento) {
		super();
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	abstract Object getFechaDeElaboracion();

	abstract Object getFechaDeVencimiento();
		
}
