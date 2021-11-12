package com.javathehutt.ONG;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LíneaAccion")
@XmlAccessorType(XmlAccessType.FIELD)
public class LineaAccion   {
    @XmlAttribute(name = "nombre")
    private final TipoProyecto nombre;
    @XmlAttribute(name = "sublineas")
    private List<String> sublineas;

    public LineaAccion(TipoProyecto nombre) {
        this.nombre = nombre;
    }

    public List<String> getSublineas() {
        return sublineas;
    }

    public boolean addSublineas(String sublinea) {
        return this.sublineas.add(sublinea);
    }

    public TipoProyecto getNombre() {
        return nombre;
    }
    
    
}
