package com.javathehutt.ONG;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Delegacion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Delegacion {

    @XmlAttribute(name = "nombre")
    private String nombre;
    @XmlAttribute(name = "cif")
    private String cif;
    @XmlAttribute(name = "direccion")
    private String direccion;
    @XmlAttribute(name = "telefono")
    private int telefono;
    @XmlAttribute(name = "email")
    private String email;

    public Delegacion(String nombre, String cif, String direccion, int telefono, String email) {
        this.nombre = nombre;
        this.cif = cif;
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}
