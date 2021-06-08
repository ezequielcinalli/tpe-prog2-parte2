package calculadores;

import palacio_duhau.ElementoComida;

public class CalculadorAdicionalSuma implements CalculadorAdicional{
    private CalculadorAdicional calculador1;
    private CalculadorAdicional calculador2;

    public CalculadorAdicionalSuma(CalculadorAdicional calc1, CalculadorAdicional calc2){
        calculador1 = calc1;
        calculador2 = calc2;
    }
    
    @Override
    public double calcularAdicional(ElementoComida comida) {        
        return calculador1.calcularAdicional(comida) + calculador2.calcularAdicional(comida);
    }
    
}
