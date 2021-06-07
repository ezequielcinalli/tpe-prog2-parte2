package palacio_duhau;

public class ComidaSimple extends ElementoComida {
	private double calorias;
	private double precio;
	private int preparacionEnMinutos;

	public ComidaSimple(String nombre, String tipo, String modoPreparacion, double calorias, double precio,
			int preparacionEnMinutos) {
		super(nombre, tipo, modoPreparacion);
		this.calorias = calorias;
		this.precio = precio;
		this.preparacionEnMinutos = preparacionEnMinutos;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public int getPreparacionEnMinutos() {
		return preparacionEnMinutos;
	}

	@Override
	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPreparacionEnMinutos(int preparacionEnMinutos) {
		this.preparacionEnMinutos = preparacionEnMinutos;
	}

}
