/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author dntn
 */
public class TablaFalsa {
     private  int interacion;
    private  double x1;
    private  double xu;
    private  double xr;
    private  double fx1;
    private  double fxu;
    private  double fxr;
    private  double et;
    private  double ea;

    public TablaFalsa(int interacion, double x1, double xu, double xr, double fx1, double fxu, double fxr, double et, double ea) {
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

    public double getFx1() {
        return fx1;
    }

    public double getFxu() {
        return fxu;
    }

    public double getFxr() {
        return fxr;
    }

    public double getEt() {
        return et;
    }

    public double getEa() {
        return ea;
    }

   
}
