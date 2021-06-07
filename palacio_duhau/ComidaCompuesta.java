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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPreparacionEnMinutos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
