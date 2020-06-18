package Manejador;

import Manejador.MetodosCerrados;
import Tablas.TablaSecante;
import static Manejador.MetodosCerrados.sustituirValores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dntn
 */
public class Secante extends MetodosCerrados{

   static double xr;
    static double xu;
    static double xi;
    static double fi;
    static double fu;
    static double fr;
    static double ea=100;
    static String funcions;

    public static void metodoSecante(double xie, double xue, double porcentaje,String funcion) {
        List<TablaSecante> tablas=new ArrayList<>();
        funcions=funcion;
        xu=xue;
        xi=xie;
        fu=Double.parseDouble(sustituirValoresEnFuncionDerivada(funcions, xu));
        fi=Double.parseDouble(sustituirValoresEnFuncionDerivada(funcions, xi));
        xr=obtenerXr();
        ea=obtenerEA();
        int x=1;
        while (ea>porcentaje){
            TablaSecante tabla=new TablaSecante(x, xr, xu, xi, ea);
            tablas.add(tabla);
            xi=xu;
            xu=xr;
            fi=fu;
            fu=Double.parseDouble(sustituirValoresEnFuncionDerivada(funcion, xu));
            xr=obtenerXr();
            obtenerEA();
            x++;
        }
        System.out.println("Termina secante jaja");
        System.out.println("X2");
    }

    private static  double obtenerXr() {
        return  xu-(fu*(xi-xu))/(fi-fu);
    }        
    
    static double obtenerEA() {
        return ((Math.abs(xr - xi) / xr) * 100);
    }
          
}
