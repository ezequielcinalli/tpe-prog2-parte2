package criterios;

import palacio_duhau.ElementoComida;

public class CriterioCaloriasMayor implements Criterio {
	private double calorias;

	public CriterioCaloriasMayor(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getCalorias() > calorias;
	}

}
