package calculadores;

import palacio_duhau.ElementoComida;

public class CalculadorAdicionalPorcentaje implements CalculadorAdicional{
    private int porcentaje;

    public CalculadorAdicionalPorcentaje(int porcent){
        porcentaje = porcent;
    }

    @Override
    public double calcularAdicional(ElementoComida comida) {
        return porcentaje * comida.getPrecio() + comida.getPrecio();
    }
    
}
