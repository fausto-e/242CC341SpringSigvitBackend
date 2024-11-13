package uni.isw.sigvitbackend.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ComprobantePago {
    private Timestamp fecha;
    private double monto;
    private int nroComprobante;
    private List<LineaRecibo> lineas;
    private Pedido pedido;


    public ComprobantePago(Timestamp fecha, double monto, int nroComprobante) {
        this.fecha = fecha;
        this.monto = monto;
        this.nroComprobante = nroComprobante;
        this.lineas = new ArrayList<>();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<LineaRecibo> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaRecibo> lineas) {
        this.lineas = lineas;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public void agregarLinea(LineaRecibo linea) {
        lineas.add(linea);
        linea.setComprobante(this);  // Asocia la LineaRecibo a este ComprobantePago
    }

}
