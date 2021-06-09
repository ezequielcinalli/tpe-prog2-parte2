package palacio_duhau;

import calculadores.*;
import criterios.*;

public class PalacioDuhau {
	private Cocina cocina;

	public PalacioDuhau() {
		cocina = new Cocina();
	}

	public Cocina getCocina() {
		return cocina;
	}

	public static void main(String[] args) {
		// CREACION COMIDAS --------------------------------------------
		ComidaSimple c1 = new ComidaSimple("Bife de cerdo", "carne", "al horno", 200, 600, 20);
		ComidaSimple c2 = new ComidaSimple("Ensalada de lechuga", "ensalada", "modoprep2", 350, 400, 40);
		ComidaSimple c3 = new ComidaSimple("Tomate", "vegetal", "modoprep3", 150, 550, 15);
		ComidaCompuesta c4 = new ComidaCompuesta("Ensalada de lechuga y tomate", "ensalada", "al horno");
		c4.addComida(c2);
		c4.addComida(c3);

		// CREACION PEDIDOS --------------------------------------------
		Pedido p1 = new Pedido(1, "pepe");
		p1.agregarComida(c2);
		p1.agregarComida(c3);
		Pedido p2 = new Pedido(2, "juan");
		p2.agregarComida(c1);
		p2.agregarComida(c4);

		// CREACION ESTACIONES --------------------------------------------
		EstacionTrabajo e1 = new EstacionTrabajo();
		e1.setEspecialidad(new CriterioModoPreparacionIgual("al horno"));

		EstacionTrabajo e2 = new EstacionTrabajo();
		e2.setEspecialidad(new CriterioTipoIgual("ensalada"));

		EstacionTrabajo e3 = new EstacionTrabajo();
		e3.setEspecialidad(new CriterioNot(new CriterioPreparacionMayor(15)));

		EstacionTrabajo e4 = new EstacionTrabajo();
		e4.setEspecialidad(new CriterioAnd(new CriterioTipoIgual("ensalada"), new CriterioCaloriasMayor(200)));

		// estacion e5 es la que acepta todo por defecto
		EstacionTrabajo e5 = new EstacionTrabajo();
		e5.setEspecialidad(new CriterioTrue());

		CalculadorAdicional calc1 = new CalculadorAdicionalSuma(
			new CalculadorAdicionalPorcentaje(10), new CalculadorAdicionalCondicion(
				new CriterioPreparacionMayor(20), 80, -10));

		// CREACION PALACIO --------------------------------------------
		PalacioDuhau palacio = new PalacioDuhau();
		
		palacio.getCocina().setCalculadorAdicional(calc1);
		palacio.getCocina().agregarEstacion(e1);
		palacio.getCocina().agregarEstacion(e2);
		palacio.getCocina().agregarEstacion(e3);
		palacio.getCocina().agregarEstacion(e4);
		palacio.getCocina().agregarEstacion(e5);

		palacio.getCocina().agregarPedido(p1);
		palacio.getCocina().agregarPedido(p2);

		System.out.println("Total del pedido p1: " + palacio.getCocina().getTotal(p1));
		System.out.println("Total del pedido p2: " + palacio.getCocina().getTotal(p2));

		System.out.println("EstacionTrabajo e1 estaLibre: " + e1.getEstaLibre());
		System.out.println("EstacionTrabajo e2 estaLibre: " + e2.getEstaLibre());
		System.out.println("EstacionTrabajo e3 estaLibre: " + e3.getEstaLibre());
		System.out.println("EstacionTrabajo e4 estaLibre: " + e4.getEstaLibre());
		System.out.println("EstacionTrabajo e5 estaLibre: " + e5.getEstaLibre());

	}
}
