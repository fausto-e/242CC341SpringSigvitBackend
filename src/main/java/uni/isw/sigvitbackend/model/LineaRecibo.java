package uni.isw.sigvitbackend.model;

public class LineaRecibo {
    private int cantidad;
    private int precio;
    private ComprobantePago comprobante;

    public LineaRecibo(int cantidad, int precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ComprobantePago getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobantePago comprobante) {
        this.comprobante = comprobante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double subtotal(){
        return (double) cantidad*precio;
    }
}
