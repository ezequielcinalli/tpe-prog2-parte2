package palacio_duhau;

public class PalacioDuhau {
	private Cocina cocina;

	public PalacioDuhau() {
		cocina = new Cocina();
	}

	// revisar encapsulamiento
	public Cocina getCocina() {
		return cocina;
	}

	public static void main(String[] args) {
		// CREACION COMIDAS --------------------------------------------
		ComidaSimple c1 = new ComidaSimple("c1", "tipo1", "modoprep1", 200, 600, 20);
		ComidaSimple c2 = new ComidaSimple("c2", "tipo2", "modoprep2", 350, 400, 40);
		ComidaSimple c3 = new ComidaSimple("c3", "tipo1", "modoprep1", 150, 550, 15);
		ComidaCompuesta c4 = new ComidaCompuesta("c4", "tipo2", "modoprep1");
		c4.addComida(c2);
		c4.addComida(c3);

		// CREACION PEDIDOS --------------------------------------------
		Pedido p1 = new Pedido(1, "pepe");
		p1.agregarComida(c1);
		p1.agregarComida(c2);
		Pedido p2 = new Pedido(2, "juan");
		p2.agregarComida(c1);
		p2.agregarComida(c4);

		// CREACION ESTACIONES --------------------------------------------
		EstacionTrabajo e1 = new EstacionTrabajo();
		e1.setEspecialidad(null);
		EstacionTrabajo e2 = new EstacionTrabajo();
		e2.setEspecialidad(null);
		EstacionTrabajo e3 = new EstacionTrabajo();
		e3.setEspecialidad(null);
		EstacionTrabajo e4 = new EstacionTrabajo();
		e4.setEspecialidad(null);

		// CREACION PALACIO --------------------------------------------
		PalacioDuhau palacio = new PalacioDuhau();
		palacio.getCocina().agregarEstacion(e1);
		palacio.getCocina().agregarEstacion(e2);
		palacio.getCocina().agregarEstacion(e3);
		palacio.getCocina().agregarEstacion(e4);

		palacio.getCocina().agregarPedido(p1);
		palacio.getCocina().agregarPedido(p2);

	}
}
