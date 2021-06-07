package criterios;

import palacio_duhau.ElementoComida;

public class CriterioNot implements Criterio{
	private Criterio crit;

	public CriterioNot(Criterio crit) {
		this.crit = crit;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return !crit.cumple(comida);
	}
	
	
}
