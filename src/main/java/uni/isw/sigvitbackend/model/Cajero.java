package uni.isw.sigvitbackend.model;

import java.util.Date;

public class Cajero extends Empleado {
    public Cajero(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento, idEmpleado, salario, fechaContratacion, horario, password);
    }
}
