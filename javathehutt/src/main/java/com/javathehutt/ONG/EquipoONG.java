package com.javathehutt.ONG;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EquipoONG")
@XmlAccessorType(XmlAccessType.FIELD)
public class EquipoONG {

    @XmlAttribute(name = "nombre")
    private String nombre;
    @XmlAttribute(name = "dni")
    private String dni;
    @XmlAttribute(name = "fechaIngreso")
    private Date fechaIngreso;
    @XmlAttribute(name = "direccion")
    private String direccion;
    @XmlAttribute(name = "telefono")
    private int telefono;
    @XmlAttribute(name = "email")
    private String email;

    public EquipoONG(String nombre, String dni, Date fechaIngreso, String direccion, int telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
