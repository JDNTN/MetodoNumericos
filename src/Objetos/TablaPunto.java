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
public class TablaPunto {
    int Interacion;
    double xr;
    double ea;

    public TablaPunto(int Interacion, double xr, double ea) {
        this.Interacion = Interacion;
        this.xr = xr;
        this.ea = ea;
    }

    public int getInteracion() {
        return Interacion;
    }

    public void setInteracion(int Interacion) {
        this.Interacion = Interacion;
    }

     public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getEa() {
        return ea;
    }

    public void setEa(double ea) {
        this.ea = ea;
    }
    
    
}
