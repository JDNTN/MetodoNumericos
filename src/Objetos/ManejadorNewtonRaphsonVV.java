/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import static Objetos.MetodosCerrados.sustituirValores;

/**
 *
 * @author dntn
 */
public class ManejadorNewtonRaphsonVV {
    
    public static String sustituirValoresEnFuncionDerivada(String funcion, double puntoX, double puntoY, double puntoZ) {
        sustituirValores.addStandardConstants();
        sustituirValores.addStandardFunctions();
        sustituirValores.addComplex();
        sustituirValores.addVariable("x", puntoX);
        sustituirValores.addVariable("y", puntoY);
        sustituirValores.addVariable("z", puntoZ);
        sustituirValores.parseExpression(funcion);
        if (sustituirValores.hasError()) {
            System.out.println(sustituirValores.getErrorInfo());
        }        
        System.out.println("el valor es: "+sustituirValores.getValue());
        return String.valueOf(sustituirValores.getValue());
    }
    
}
