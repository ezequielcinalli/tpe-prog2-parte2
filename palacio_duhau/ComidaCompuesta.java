package palacio_duhau;

import java.util.ArrayList;

public class ComidaCompuesta extends ElementoComida {
	private ArrayList<ElementoComida> comidas;

	public ComidaCompuesta(String nombre, String tipo, String modoPreparacion) {
		super(nombre, tipo, modoPreparacion);
		this.comidas = new ArrayList<ElementoComida>();
	}

	public void addComida(ElementoComida comida) {
		if (!comidas.contains(comida))
			comidas.add(comida);
	}

	@Override
	public double getCalorias() {
		double total = 0;
		if (!comidas.isEmpty())
			for (ElementoComida elemento : comidas) {
				total += elemento.getCalorias();
			}
		return total;
	}

	@Override
	public double getPrecio() {
		double total = 0;
		if(!comidas.isEmpty())
			for (ElementoComida elemento : comidas) {
				total+= elemento.getPrecio();
			}
		return total;
	}

	@Override
	public int getPreparacionEnMinutos() {
		int total = 0;
		if (!comidas.isEmpty())
			for (ElementoComida elemento : comidas) {
				total += elemento.getPreparacionEnMinutos();
			}
		return total;
	}

}
