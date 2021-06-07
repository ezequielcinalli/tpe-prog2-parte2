package criterios;

import palacio_duhau.ElementoComida;

public class CriterioNombreIgual implements Criterio {
	private String nombre;

	public CriterioNombreIgual(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getNombre().equals(nombre);
	}

}
