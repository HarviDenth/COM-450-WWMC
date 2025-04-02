package com450.primerparcial;

public class CalculoAreaCirculo {

    public static double radioPositivo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double radioCero(double radio) {
        System.out.println("El area con radio cero es 0.");
        return 0;
    }
    public static double radioNegativo(double radio) {
        System.out.println("El radio no puede ser negativo");
        return -1;
    }
    public static double radioGrande(double radio) {
        //double resultado = Math.PI * Math.pow(radio, 2);
        //System.out.println(resultado);
        return Math.PI * Math.pow(radio, 2);
    }
    public static double radioDecimal(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

}
