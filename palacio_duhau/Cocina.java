package palacio_duhau;

import java.util.ArrayList;

import calculadores.*;

public class Cocina {
	private ArrayList<EstacionTrabajo> estaciones;
	private ArrayList<Pedido> pedidos;
	private CalculadorAdicional calculador;

	public Cocina() {
		estaciones = new ArrayList<EstacionTrabajo>();
		pedidos = new ArrayList<Pedido>();
		calculador = null;
	}

	public void agregarPedido(Pedido pedido) {
		if (!pedidos.contains(pedido)) {
			pedidos.add(pedido);
		}
		asignarPedido(pedido);
	}

	public void asignarPedido(Pedido pedido) {
		ArrayList<ElementoComida> comidas = pedido.getComidas();
		for (ElementoComida c : comidas) {
			for (EstacionTrabajo e : estaciones) {
				if (e.aceptaComida(c)) {
					e.setComida(c);
					break;
				}
			}
		}
	}

	public void agregarEstacion(EstacionTrabajo estacion) {
		if (!estaciones.contains(estacion))
			estaciones.add(estacion);
	}

	public void setCalculadorAdicional(CalculadorAdicional calc) {
		calculador = calc;
	}

	public double calcularAdicional(ElementoComida comida) {
		if (calculador == null)
			return 0;
		return calculador.calcularAdicional(comida);
	}

	public double getTotal(Pedido p) {
		double total = 0;
		for (ElementoComida comida : p.getComidas()) {
			total += comida.getPrecio();
			total += calcularAdicional(comida);
		}
		return total;
	}

}
