package com.javathehutt.ONG;

import java.sql.Date;

public class Ingresos {

    private String nombre;
    private Date fecha;

    public Ingresos(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
