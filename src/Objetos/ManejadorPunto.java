package Objetos;

import java.util.ArrayList;
import java.util.List;
import org.nfunk.jep.JEP;

/**
 *
 * @author dntn
 */
public class ManejadorPunto {
    
    static double x1=0;
    static double ea=100;
    static double fx1=0;
    private static TablaPunto interacionTabla;
    
     public static List<TablaPunto> generarTablaPorcentual(String funcion, double valor1, double porcentaje) {
        List<TablaPunto> tabla = new ArrayList<>();        
        ea=100;
        x1 = valor1;        
        int contador = 0;
        while (porcentaje < ea) {
            contador++;                        
            fx1 = obtenerValor(funcion, x1);   
            if(contador>1){
                ea = obtenerEA();    
            } 
            interacionTabla = new TablaPunto(contador, x1, ea);
            tabla.add(interacionTabla);                        
            x1=fx1;
        }
        return tabla;
    }
     
       private static double obtenerValor(String funcion, double valor) {
        double val = Double.parseDouble(ManejadorBiseccion.sustituirValoresEnFuncionDerivada(funcion, valor));
        return val;
    }
       private static double obtenerEA() {
        return (Math.abs((fx1 - x1) / fx1) * 100);
    }
}
