package Tablas;

/**
 *
 * @author dntn
 */
public class TablaNewtonRaphsonVV {
    private double x;
    private double y;
    private double z;
    private double fxyz;
    private double gxyz;
    private double hxyz;
    private double h1;
    private double h2;
    private double h3;

    public TablaNewtonRaphsonVV(double x, double y, double z, double fxyz, double gxyz, double hxyz, double h1, double h2, double h3) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fxyz = fxyz;
        this.gxyz = gxyz;
        this.hxyz = hxyz;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getFxyz() {
        return fxyz;
    }

    public void setFxyz(double fxyz) {
        this.fxyz = fxyz;
    }

    public double getGxyz() {
        return gxyz;
    }

    public void setGxyz(double gxyz) {
        this.gxyz = gxyz;
    }

    public double getHxyz() {
        return hxyz;
    }

    public void setHxyz(double hxyz) {
        this.hxyz = hxyz;
    }

    public double getH1() {
        return h1;
    }

    public void setH1(double h1) {
        this.h1 = h1;
    }

    public double getH2() {
        return h2;
    }

    public void setH2(double h2) {
        this.h2 = h2;
    }

    public double getH3() {
        return h3;
    }

    public void setH3(double h3) {
        this.h3 = h3;
    }
    
    
}
