package com.javathehutt.ONG;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ONG")
@XmlAccessorType(XmlAccessType.FIELD)
public class ONG   {
    @XmlAttribute(name = "equipoONG")
    private EquipoONG equipoONG;
    @XmlAttribute(name = "proyectos")
    private List<Proyecto> proyectos;
    @XmlAttribute(name = "ingresos")
    private List<Ingresos> ingresos;
    @XmlAttribute(name = "delegaciones")
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

