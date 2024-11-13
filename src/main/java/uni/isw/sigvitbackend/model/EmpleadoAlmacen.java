package uni.isw.sigvitbackend.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoAlmacen extends Empleado{
    private Almacen almacen;
    private List<SolicitudCompra> solicitudesCompra;

    public EmpleadoAlmacen(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento, idEmpleado, salario, fechaContratacion, horario, password);
        this.solicitudesCompra = new ArrayList<>();
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public List<SolicitudCompra> getSolicitudesCompra() {
        return solicitudesCompra;
    }

    public void setSolicitudesCompra(List<SolicitudCompra> solicitudesCompra) {
        this.solicitudesCompra = solicitudesCompra;
    }
}
