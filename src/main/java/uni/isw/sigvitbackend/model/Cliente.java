package uni.isw.sigvitbackend.model;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private String password;
    private Carrito carrito;
    private MedioPago medioPago;

    public Cliente(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idCliente, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento);
        this.idCliente = idCliente;
        this.password = password;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean registrarCliente(){
        return true;
    }
}
