package Objetos;

import java.util.ArrayList;
import java.util.List;
import org.nfunk.jep.JEP;

/**
 *
 * @author dntn
 */
public class ManejadorBiseccion extends MetodosCerrados {

    private static TablaBiseccion interacionTabla;
    static String fx1;
    static String fxu;
    static String fxr;

    public static List<TablaBiseccion> generarTablaInteraciones(String funcion, double valor1, double valor2, int interaciones) {
        List<TablaBiseccion> tabla = new ArrayList<>();
        x1 = valor1;
        xu = valor2;
        for (int interacion = 0; interacion < interaciones; interacion++) {
            xr = valorXr(x1, xu);
            valorProximoActual = xr;
            fx1 = obtenerSigno(funcion, x1);
            fxu = obtenerSigno(funcion, xu);
            fxr = obtenerSigno(funcion, xr);
            ea = obtenerEA();
            interacionTabla = new TablaBiseccion(interacion + 1, x1, xu, xr, fx1, fxu, fxr, et, ea);
            tabla.add(interacionTabla);
            valorProximoAnterior = xr;
            cambioValorX(fx1, fxu, fxr, xr);
        }
        return tabla;
    }

    public static List<TablaBiseccion> generarTablaPorcentual(String funcion, double valor1, double valor2, double porcentaje) {
        List<TablaBiseccion> tabla = new ArrayList<>();
        limpiarVariables();
        int contador = 0;
        x1 = valor1;
        xu = valor2;
        while (porcentaje < ea) {            
            xr = valorXr(x1, xu);
            valorProximoActual = Math.abs(xr);
            fx1 = obtenerSigno(funcion, x1);
            fxu = obtenerSigno(funcion, xu);
            fxr = obtenerSigno(funcion, xr);
            ea = obtenerEA();
            contador++;
            interacionTabla = new TablaBiseccion(contador, x1, xu, xr, fx1, fxu, fxr, et, ea);
            tabla.add(interacionTabla);
            valorProximoAnterior = Math.abs(xr);
            cambioValorX(fx1, fxu, fxr, xr);            
        }
        return tabla;
    }

    private static double valorXr(double x1, double xu) {
        return ((xu + x1) / 2);
    }

    private static String obtenerSigno(String funcion, double valor) {
        double val = Double.parseDouble(sustituirValoresEnFuncionDerivada(funcion, valor));
        if (val > 0) {
            return "+";
        } else if (val < 0) {
            return "-";
        }
        return "+";
    }

    private static void cambioValorX(String fx1, String fxu, String fxr, double xr) {
        if (fx1.equals(fxr)) {
            x1 = xr;
        } else if (fxu.equals(fxr)) {
            xu = xr;
        }
    }

}
