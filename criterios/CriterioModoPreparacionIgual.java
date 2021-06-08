package criterios;

import palacio_duhau.ElementoComida;

public class CriterioModoPreparacionIgual implements Criterio {
	private String modo;

	public CriterioModoPreparacionIgual(String modo) {
		//Ver si es necesario llamar constructor Super ya que Criterio no tiene constructor
		super();
		this.modo = modo;
	}

	@Override
	public boolean cumple(ElementoComida comida) {
		return comida.getModoPreparacion().equals(modo);
	}

}
