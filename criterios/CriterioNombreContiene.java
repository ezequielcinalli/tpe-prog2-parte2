package criterios;

import palacio_duhau.ElementoComida;

public class CriterioNombreContiene implements Criterio {
	private String nombre;

	public CriterioNombreContiene(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getNombre().contains(nombre);
	}

}
