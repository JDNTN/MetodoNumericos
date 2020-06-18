package Manejador;

import Tablas.TablaFalsa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dntn
 */
public class ManejadorFalsa extends MetodosCerrados {

    private static TablaFalsa interacionTabla;

    public static List<TablaFalsa> generarTablaInteraciones(String funcion, double valor1, double valor2, int interaciones) {
        List<TablaFalsa> tabla = new ArrayList<>();
        x1 = valor1;
        xu = valor2;
        limpiarVariables();
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
        limpiarVariables();
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

    static double valorXr(double x1, double xu) {
        double moment = xu - ((fxu * (x1 - xu)) / (fx1 - fxu));
        return moment;
    }

    private static double obtenerValor(String funcion, double valor) {
        double val = Double.parseDouble(ManejadorBiseccion.sustituirValoresEnFuncionDerivada(funcion, valor));
        return val;
    }

    private static void cambioValorX(double fx1, double fxu, double fxr, double xr) {
        if (fxr > 0) {
            if (fx1 >= 0) {
                x1 = xr;
            } else if (fxu >= 0) {
                xu = xr;
            }
        } else if (fxr < 0) {
            if (fx1 < 0) {
                x1 = xr;
            } else if (fxu < 0) {
                xu = xr;
            }
        }
    }

}
