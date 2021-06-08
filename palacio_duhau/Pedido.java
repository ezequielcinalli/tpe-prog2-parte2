package palacio_duhau;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<ElementoComida> comidas;
	private int mesa;
	private String mozo;

	public Pedido(int mesa, String mozo) {
		this.comidas = new ArrayList<ElementoComida>();
		this.mesa = mesa;
		this.mozo = mozo;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public ArrayList<ElementoComida> getComidas() {
		return new ArrayList<ElementoComida>(comidas);
	}

	public void agregarComida(ElementoComida comida) {
		comidas.add(comida);
	}

	public String getMozo() {
		return mozo;
	}

	public void setMozo(String mozo) {
		this.mozo = mozo;
	}

	@Override
	public String toString() {
		return "Pedido numero de mesa: " + mesa + " , nombre de mozo: " + mozo;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Pedido otroPedido = (Pedido) obj;
			boolean mesasIguales = getMesa() == otroPedido.getMesa();
			boolean mozosIguales = getMozo().equals(otroPedido.getMozo());
			return (mesasIguales && mozosIguales);
		} catch (Exception e) {
			return false;
		}
	}

}
