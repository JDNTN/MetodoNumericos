/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

import static Manejador.MetodosCerrados.sustituirValores;
import Tablas.TablaNewtonRaphsonVV;
import java.util.ArrayList;

/**
 *
 * @author dntn
 */
public class ManejadorNewtonRaphsonVV {

    private static double f1;
    private static double f2;
    private static double f3;
    private static double h1;
    private static double h2;
    private static double h3;

    public static double sustituirValoresEnFuncionDerivada(String funcion, double puntoX, double puntoY, double puntoZ) {
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
        return sustituirValores.getValue();
    }

    public static ArrayList<TablaNewtonRaphsonVV> CrearTabla(String f, String g, String h, double x, double y, double z, ArrayList<String> derivadas) {
        ArrayList<TablaNewtonRaphsonVV> tabla = new ArrayList<>();
        TablaNewtonRaphsonVV tab;
        f1 = sustituirValoresEnFuncionDerivada(f, x, y, z);
        f2 = sustituirValoresEnFuncionDerivada(g, x, y, z);
        f3 = sustituirValoresEnFuncionDerivada(h, x, y, z);
        int cont = 0;
        while (f1 > 0.0000005 || f2 > 0.0000005 || f3 > 0.0000005) {
            double[] fn = obtenerFn();
            double[][] matrizIn = obtenerMatrizInversa(derivadas, x, y, z);            
            h1 = matrizIn[0][0] * fn[0] + matrizIn[0][1] * fn[1] + matrizIn[0][2] * fn[2];
            h2 = matrizIn[1][0] * fn[0] + matrizIn[1][1] * fn[1] + matrizIn[1][2] * fn[2];
            h3 = matrizIn[2][0] * fn[0] + matrizIn[2][1] * fn[1] + matrizIn[2][2] * fn[2];
            tab = new TablaNewtonRaphsonVV(x, y, z, f1, f2, f3, h1, h2, h3);
            tabla.add(tab);
            x += h1;
            y += h2;
            z += h3;
            f1 = sustituirValoresEnFuncionDerivada(f, x, y, z);
            f2 = sustituirValoresEnFuncionDerivada(g, x, y, z);
            f3 = sustituirValoresEnFuncionDerivada(h, x, y, z);
        }
        return tabla;
    }

    public static double[] obtenerFn() {
        double[] fn = {-f1, -f2, -f3};
        return fn;
    }

    private static double[][] obtenerMatrizInversa(ArrayList<String> derivadas, double valx, double valy, double valz) {
        double[][] derivadasParciales = new double[3][3];
        int x = 0;
        int y = 0;
        double as = 0;
        for (int a = 0; a < derivadas.size(); a++) {
            if (x == 3) {
                y++;
                x = 0;
            }
            as = sustituirValoresEnFuncionDerivada(derivadas.get(a), valx, valy, valz);           
            derivadasParciales[y][x] = as;
            x++;
        }
        return invert(derivadasParciales);
    }

    public static double[][] invert(double a[][]) {

        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        // Transform the matrix into an upper triangle
        gaussian(a, index);

        // Update the matrix b[i][j] with the ratios stored
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        // Perform backward substitutions
        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }

                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    // Method to carry out the partial-pivoting Gaussian
    // elimination.  Here index[] stores pivoting order.
    public static void gaussian(double a[][], int index[]) {

        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        // Find the rescaling factors, one from each row
        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }

        // Search the pivoting element from each column
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {

                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];

                // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

                // Modify other elements accordingly
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

}
