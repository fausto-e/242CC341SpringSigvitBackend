package uni.isw.sigvitbackend.model;

import java.util.Date;

public class Empleado extends Persona{
    private int idEmpleado;
    private double salario;
    private Date fechaContratacion;
    private String horario;
    private String password;

    public Empleado(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.horario = horario;
        this.password = password;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean registrarEmpleado(){
        return true;
    }
}
