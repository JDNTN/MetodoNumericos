/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodobiseccion;

import FrontEnd.*;
import java.util.Scanner;

/**
 *
 * @author dntn
 */
public class MetodoBiseccion {

    static Scanner algo = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lectura = "";
        System.out.println("Que metodo desea");
        lectura = algo.next();
        switch (lectura) {
            case "1":
                MetodosCerrados i=new MetodosCerrados();
                i.setVisible(true);
                break;
            case "2":
                Falso f = new Falso();
                f.setVisible(true);
                break;
        }
    }

}
