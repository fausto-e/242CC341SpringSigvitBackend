package uni.isw.sigvitbackend.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Administrador extends Empleado{
    private List<SolicitudCompra> solicitudes;

    public Administrador(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento, idEmpleado, salario, fechaContratacion, horario, password);
        this.solicitudes = new ArrayList<>();
    }

    public List<SolicitudCompra> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCompra> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
