/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author dntn
 */
public class TablaBiseccion {
    
    private  int interacion;
    private  double x1;
    private  double xu;
    private  double xr;
    private  String fx1;
    private  String fxu;
    private  String fxr;
    private  double et;
    private  double ea;

    public TablaBiseccion(int interacion, double x1, double xu, double xr, String fx1, String fxu, String fxr, double et, double ea) {
        this.interacion = interacion;
        this.x1 = x1;
        this.xu = xu;
        this.xr = xr;
        this.fx1 = fx1;
        this.fxu = fxu;
        this.fxr = fxr;
        this.et = et;
        this.ea = ea;
    }

    public int getInteracion() {
        return interacion;
    }

    public double getX1() {
        return x1;
    }

    public double getXu() {
        return xu;
    }

    public double getXr() {
        return xr;
    }

    public String getFx1() {
        return fx1;
    }

    public String getFxu() {
        return fxu;
    }

    public String getFxr() {
        return fxr;
    }

    public double getEt() {
        return et;
    }

    public double getEa() {
        return ea;
    }

 

    
}
