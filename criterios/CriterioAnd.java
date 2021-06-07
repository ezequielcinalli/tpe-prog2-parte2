package criterios;

import palacio_duhau.ElementoComida;

public class CriterioAnd implements Criterio {
	private Criterio crit1, crit2;

	public CriterioAnd(Criterio crit1, Criterio crit2) {
		this.crit1 = crit1;
		this.crit2 = crit2;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return (crit1.cumple(comida) && crit2.cumple(comida));
	}

}
