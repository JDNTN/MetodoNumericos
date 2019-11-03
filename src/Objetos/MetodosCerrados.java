/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import org.nfunk.jep.JEP;

/**
 *
 * @author dntn
 */
public abstract class MetodosCerrados {

    static JEP sustituirValores = new JEP();
    static TablaFalsa interacionTabla;
    static double x1;
    static double xu;
    static double valorProximoActual = 0;
    static double valorProximoAnterior = 0;
    static double xr = 0;
    static double fx1;
    static double fxu;
    static double fxr;
    static double et = 0;
    static double ea = 1;

    public static String sustituirValoresEnFuncionDerivada(String funcion, double puntoEvaluar) {
        sustituirValores.addStandardConstants();
        sustituirValores.addStandardFunctions();
        sustituirValores.addComplex();
        sustituirValores.addVariable("x", puntoEvaluar);
        sustituirValores.parseExpression(funcion);
        if (sustituirValores.hasError()) {
            System.out.println(sustituirValores.getErrorInfo());
        }
        return String.valueOf(sustituirValores.getValue());
    }

    static double obtenerEA() {
        return ((Math.abs(valorProximoActual - valorProximoAnterior) / valorProximoActual) * 100);
    }

    static void limpiarVariables() {
        ea = 100;
        valorProximoActual=0;
        valorProximoAnterior=0;
    }
}
