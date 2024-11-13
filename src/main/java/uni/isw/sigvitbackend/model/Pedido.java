package uni.isw.sigvitbackend.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ComprobantePago> comprobantes;
    private Domicilio domicilio;
    private Tienda tienda;
    private Carrito carrito;

    public Pedido() {
        this.comprobantes = new ArrayList<>();
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<ComprobantePago> getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(List<ComprobantePago> comprobantes) {
        this.comprobantes = comprobantes;
    }

    public boolean registrarPedido(){
        return true;
    }
}
