package criterios;

import palacio_duhau.ElementoComida;

public class CriterioPreparacionMayor implements Criterio {
	private int minutos;

	public CriterioPreparacionMayor(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getPreparacionEnMinutos() > minutos;
	}

}
