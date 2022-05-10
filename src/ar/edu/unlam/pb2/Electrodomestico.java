package ar.edu.unlam.pb2;

public abstract class Electrodomestico {

	protected Integer garantia;
	
	protected Electrodomestico(Integer garantia) {
		super();
		this.garantia = garantia;
	}

	abstract Object getGarantia();

}
