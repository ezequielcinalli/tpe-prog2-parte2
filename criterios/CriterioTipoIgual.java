package criterios;

import palacio_duhau.ElementoComida;

public class CriterioTipoIgual implements Criterio {
	private String tipo;

	public CriterioTipoIgual(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getTipo().equals(tipo);
	}
}
