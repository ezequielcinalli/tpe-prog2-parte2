package palacio_duhau;

import criterios.Criterio;

public class EstacionTrabajo {
	private ElementoComida comida;
	private Criterio especialidad;

	public ElementoComida getComida() {
		return comida;
	}

	public void setComida(ElementoComida comida) {
		this.comida = comida;
	}

	public boolean getEstaLibre() {
		return comida == null;
	}

	public boolean aceptaComida(ElementoComida comida) {
		if (especialidad == null)
			return false;
		return especialidad.cumple(comida);
	}

	public void setEspecialidad(Criterio esp) {
		this.especialidad = esp;
	}

}
