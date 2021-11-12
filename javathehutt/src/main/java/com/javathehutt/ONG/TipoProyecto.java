package com.javathehutt.ONG;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoProyecto")
@XmlAccessorType(XmlAccessType.FIELD)
public enum TipoProyecto {
    educacionDesarroillo,
    fortalecimientoInstitucional,
    cooperacionAlDesarrollo,
    accionHumanitaria,
}
