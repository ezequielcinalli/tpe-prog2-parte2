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
		double suma = 0;
		for (ElementoComida comida : comidas) {
			suma += comida.getCalorias();
		}
		return suma;
	}

	@Override
	public double getPrecio() {
		double suma = 0;
		for (ElementoComida comida : comidas) {
			suma += comida.getPrecio();
		}
		return suma;
	}

	@Override
	public int getPreparacionEnMinutos() {
		int suma = 0;
		for (ElementoComida comida : comidas) {
			suma += comida.getPreparacionEnMinutos();
		}
		return suma;
	}

}
