package uni.isw.sigvitbackend.model;

import java.util.Date;

public class Pisco extends Bebida{
    private String tipoUva;

    public Pisco(int idProduct, String descripcion, String nombre, double precio, int stock, double volumen, String origen, Date fechaCosecha, String tipoUva) {
        super(idProduct, descripcion, nombre, precio, stock, volumen, origen, fechaCosecha);
        this.tipoUva = tipoUva;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }
}
