package uni.isw.sigvitbackend.model;

import java.util.Date;

public class Bebida extends Producto{
    private double volumen;
    private String origen;
    private Date fechaCosecha;

    public Bebida(int idProduct, String descripcion, String nombre, double precio, int stock, double volumen, String origen, Date fechaCosecha) {
        super(idProduct, descripcion, nombre, precio, stock);
        this.volumen = volumen;
        this.origen = origen;
        this.fechaCosecha = fechaCosecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Date getFechaCosecha() {
        return fechaCosecha;
    }

    public void setFechaCosecha(Date fechaCosecha) {
        this.fechaCosecha = fechaCosecha;
    }
}
