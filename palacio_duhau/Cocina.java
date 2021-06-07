package palacio_duhau;

import java.util.ArrayList;

import calculadores.CalculadorAdicional;

public class Cocina {
	private ArrayList<EstacionTrabajo> estaciones;
	private ArrayList<Pedido> pedidos;
	private static CalculadorAdicional calculador = null;

	public Cocina() {
		estaciones = new ArrayList<EstacionTrabajo>();
		pedidos = new ArrayList<Pedido>();
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
					//revisar este return si sale del primer o segundo for
					return;
				}
			}
		}
	}

	public void agregarEstacion(EstacionTrabajo estacion) {
		if (!estaciones.contains(estacion))
			estaciones.add(estacion);
	}

	public static void setCalculadorAdicional(CalculadorAdicional calc) {
		Cocina.calculador = calc;
	}

	public static double calcularAdicional(ElementoComida comida) {
		if (calculador == null)
			return 0;
		return calculador.calcularAdicional(comida);
	}

}
