package Objetos;

import static Objetos.ManejadorBiseccion.ea;
import java.util.ArrayList;
import java.util.List;
import org.nfunk.jep.JEP;

/**
 *
 * @author dntn
 */
public class ManejadorFalsa {
    private static JEP sustituirValores = new JEP();
    private static TablaFalsa interacionTabla;
    private static double x1;
    private static double xu;
    private static double valorProximoActual = 0;
    private static double valorProximoAnterior = 0;
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

    public static List<TablaFalsa> generarTablaInteraciones(String funcion, double valor1, double valor2, int interaciones) {
        List<TablaFalsa> tabla = new ArrayList<>();
        x1 = valor1;
        xu = valor2;
        for (int interacion = 0; interacion < interaciones; interacion++) {
            fx1 = obtenerValor(funcion, x1);
            fxu = obtenerValor(funcion, xu);
            xr = valorXr(x1, xu);
            valorProximoActual = Math.abs(xr);
            fxr = obtenerValor(funcion, xr);
            ea = obtenerEA();
            interacionTabla = new TablaFalsa(interacion, x1, xu, xr, fx1, fxu, fxr, et, ea);
            tabla.add(interacionTabla);
            valorProximoAnterior = Math.abs(xr);            
            cambioValorX(fx1, fxu, fxr, xr);
        }
        return tabla;
    }

    public static List<TablaFalsa> generarTablaPorcentual(String funcion, double valor1, double valor2, double porcentaje) {
        List<TablaFalsa> tabla = new ArrayList<>();        
        x1 = valor1;
        xu = valor2;
        int contador = 0;
        while (porcentaje < ea) {
            contador++;                        
            fx1 = obtenerValor(funcion, x1);
            fxu = obtenerValor(funcion, xu);
            xr = valorXr(x1, xu);
            valorProximoActual = Math.abs(xr);
            fxr = obtenerValor(funcion, xr);
            ea = obtenerEA();
            interacionTabla = new TablaFalsa(contador, x1, xu, xr, fx1, fxu, fxr, et, ea);
            tabla.add(interacionTabla);
            valorProximoAnterior = Math.abs(xr);            
            cambioValorX(fx1, fxu, fxr, xr);
        }
        return tabla;
    }

    private static double valorXr(double x1, double xu) {
        double moment= xu-((fxu*(x1-xu))/(fx1-fxu));
        return moment;
    }

    private static double obtenerValor(String funcion, double valor) {
        double val = Double.parseDouble(ManejadorBiseccion.sustituirValoresEnFuncionDerivada(funcion, valor));
        return val;
    }

    private static void cambioValorX(double fx1, double fxu, double fxr, double xr) {
        if(fxr>0){
            if(fx1>=0){
                x1=xr;
            }else if(fxu>=0){
                xu=xr;
            }
        }else if(fxr<0){
            if(fx1<0){
                x1=xr;
            }else if(fxu<0){
                xu=xr;
            }
        }
    }

    private static double obtenerEA() {
        return ((Math.abs(valorProximoActual - valorProximoAnterior) / valorProximoActual) * 100);
    }
    
    

}
