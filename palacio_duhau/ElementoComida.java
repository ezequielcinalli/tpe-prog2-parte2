package palacio_duhau;

public abstract class ElementoComida {
	private String nombre;
	private String tipo;
	private String modoPreparacion;

	public ElementoComida(String nombre, String tipo, String modoPreparacion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.modoPreparacion = modoPreparacion;
	}

	public abstract double getCalorias();

	public abstract double getPrecio();

	public abstract int getPreparacionEnMinutos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo.toLowerCase();
	}

	public String getModoPreparacion() {
		return modoPreparacion;
	}

	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion.toLowerCase();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ElementoComida otraComida = (ElementoComida) obj;
			return getNombre().equals(otraComida.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

}
