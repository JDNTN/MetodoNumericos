package Derivadas;

import java.util.Scanner;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
/**
 *
 * @author dntn
 */
public class DerivadasParciales {
    
    private static DJep derivar = new DJep();
    private static Scanner leer = new Scanner(System.in);
    private static Node funcionAnalizada;
    private static Node funcionDerivada;
    private static Node funcionSimplificada;          
    private static String derivada = null;
    
    public static String derivarFuncion(String funcion, String var){
        derivar.addStandardFunctions();
        derivar.addStandardConstants();
        derivar.addComplex();
        derivar.setAllowUndeclared(true);
        derivar.setAllowAssignment(true);
        derivar.setImplicitMul(true);
        derivar.addStandardDiffRules();
        try{
            funcionAnalizada = derivar.parse(funcion);
            funcionDerivada = derivar.differentiate(funcionAnalizada, var);
            funcionSimplificada = derivar.simplify(funcionDerivada);
            derivada = derivar.toString(funcionSimplificada);    
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        return derivada;
    }
     
}
