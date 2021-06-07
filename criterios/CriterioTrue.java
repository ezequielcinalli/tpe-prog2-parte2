package criterios;

import palacio_duhau.ElementoComida;

public class CriterioTrue implements Criterio {

	@Override
	public boolean cumple(ElementoComida comida) {
		return true;
	}

}
