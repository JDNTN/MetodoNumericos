package Objetos;

import static Objetos.MetodosCerrados.sustituirValores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dntn
 */
public class ManejadorNewtonRaphson {

   static  double xr;    
   static  double anterior;
   static  double valorEtNewton;
   static  double valorDevFxr;
   static  double valorDev2Fxr;
   static  double valorFxr;
   static  double et;
   static  double ea = 100;
   static  int contador = 0;
   static  TablaNewton tabla;

    public static List<TablaNewton> metodoNewton(String funcion, String derivada, String segundaDerivada, double porcentaje, double xi, double valorReal) {
        List<TablaNewton> tablasNewton=new ArrayList<>();
        xr = 3.1;
        valorFxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(funcion, xr));
        valorDevFxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(derivada, xr));
        valorDev2Fxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(segundaDerivada, xr));
        encontrarEt(valorReal);
        encontrarEtNewton();
        contador = 0;
        while (ea > porcentaje) {
            if (contador != 0) {
                anterior=xr;
                encontrarXr();
                valorFxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(funcion, xr));
                valorDevFxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(derivada, xr));
                valorDev2Fxr = Double.parseDouble(sustituirValoresEnFuncionDerivada(segundaDerivada, xr));
                encontrarEt(valorReal);
                encontrarEtNewton();
                ea=obtenerEA();
            }
            tabla=new TablaNewton(contador, xr, et, ea, valorEtNewton);
            tablasNewton.add(tabla);
            contador++;
        }
        return tablasNewton;
    }

    public static  void encontrarXr() {
        xr = xr - (valorFxr / valorDevFxr);
    }

    public static void encontrarEtNewton() {

        valorEtNewton = -(valorDev2Fxr * (Math.pow(et, 2)) / (2 * valorDevFxr));
    }

    public static  void encontrarEt(double valorReal) {
        et = valorReal - xr;
    }

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
    
     private static double obtenerEA() {
        return (Math.abs((xr - anterior) / xr) * 100);
    }
}
