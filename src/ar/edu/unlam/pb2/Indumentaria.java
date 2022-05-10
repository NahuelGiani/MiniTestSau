package ar.edu.unlam.pb2;

public abstract class Indumentaria {

	protected String talle;
	protected String color;
	
	public Indumentaria(String talle, String color) {
		super();
		this.talle = talle;
		this.color = color;
	}

	abstract Object getTalle();

	abstract Object getColor();

}
