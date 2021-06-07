package criterios;

import palacio_duhau.ElementoComida;

public class CriterioPrecioMayor implements Criterio {
	private double precio;

	public CriterioPrecioMayor(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getPrecio() > precio;
	}

}
