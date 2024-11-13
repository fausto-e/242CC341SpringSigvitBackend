package uni.isw.sigvitbackend.model;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String numEmpresa;
    private int ruc;
    private List<Producto> productos;

    public Proveedor(String numEmpresa, int ruc) {
        this.numEmpresa = numEmpresa;
        this.ruc = ruc;
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
}
