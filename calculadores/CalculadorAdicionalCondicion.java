package calculadores;
import criterios.Criterio;

import palacio_duhau.ElementoComida;

public class CalculadorAdicionalCondicion implements CalculadorAdicional{
    private Criterio condicion;
    private double valorCumple;
    private double valorNoCumple;

    public CalculadorAdicionalCondicion(Criterio condic, double valCumple, double valNoCumple){
        condicion = condic;
        valorCumple = valCumple;
        valorNoCumple = valNoCumple;
    }

    @Override
    public double calcularAdicional(ElementoComida comida) {
        if (condicion.cumple(comida))
            return valorCumple;
        else
            return valorNoCumple;
    }
    
}
