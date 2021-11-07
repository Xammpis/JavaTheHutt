package com.javathehutt.ONG;

import java.util.List;

public class ONG   {
    private EquipoONG equipoONG;
    private List<Proyecto> proyectos;
    private List<Ingresos> ingresos;
    private final List<Delegacion> delegaciones;

    public ONG(EquipoONG equipoONG, List<Delegacion> delegaciones) {
        this.equipoONG = equipoONG;
        this.delegaciones = delegaciones;
    }
    
    public EquipoONG getEquipoONG() {
        return equipoONG;
    }

    public void setEquipoONG(EquipoONG equipoONG) {
        this.equipoONG = equipoONG;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    public List<Delegacion> getDelegaciones() {
        return delegaciones;
    }

    public boolean addDelegaciones(Delegacion delegacion) {
        return this.delegaciones.add(delegacion);
    }

    public boolean delDelegaciones(Delegacion delegacion) {
        return this.delegaciones.remove(delegacion);
    }
}

