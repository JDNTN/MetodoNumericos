package Objetos;

/**
 *
 * @author dntn
 */
public class TablaNewton {
    int interacion;
    double xr;
    double et;
    double ea;
    double etNewton;

    public TablaNewton(int interacion, double xr, double et, double ea, double etNewton) {
        this.interacion = interacion;
        this.xr = xr;
        this.et = et;
        this.ea = ea;
        this.etNewton = etNewton;
    }

    public int getInteracion() {
        return interacion;
    }

    public double getXr() {
        return xr;
    }

    public double getEt() {
        return et;
    }

    public double getEa() {
        return ea;
    }

    public double getEtNewton() {
        return etNewton;
    }
    
    
}
