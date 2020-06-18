package Objetos;

/**
 *
 * @author dntn
 */
public class TablaSecante {

    private int interacion;
    private double xr;
    private double xu;
    private double xi;
    private double ea;

    public TablaSecante(int interacion, double xr, double xu, double xi, double ea) {
        this.interacion = interacion;
        this.xr = xr;
        this.xu = xu;
        this.xi = xi;
        this.ea = ea;
    }

    public int getInteracion() {
        return interacion;
    }

    public double getXr() {
        return xr;
    }

    public double getXu() {
        return xu;
    }

    public double getXi() {
        return xi;
    }

    public double getEa() {
        return ea;
    }

    
}
