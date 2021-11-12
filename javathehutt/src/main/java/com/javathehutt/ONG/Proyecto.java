package com.javathehutt.ONG;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Proyecto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Proyecto {

    @XmlAttribute(name = "nombre")
    private String nombre;
    @XmlAttribute(name = "pais")
    private String pais;
    @XmlAttribute(name = "localizacion")
    private String localizacion;
    @XmlAttribute(name = "fechaInicio")
    private Date fechaInicio;
    @XmlAttribute(name = "fechaFin")
    private Date fechaFin;
    @XmlAttribute(name = "socioLoccal")
    private String socioLocal;
    @XmlAttribute(name = "financiador")
    private String financiador;
    @XmlAttribute(name = "finanaciacionaportada")
    private float financiacionaportada;
    @XmlAttribute(name = "codigoProyecto")
    private int codigoProyecto;
    @XmlAttribute(name = "tipoProyecto")
    private String tipoProyecto;
    @XmlAttribute(name = "PersonalAsignado")
    private String personalAsignado;
    @XmlAttribute(name = "lineaAccion")
    private LineaAccion lineaAccion;

    public Proyecto(String nombre, String pais, String localizacion, int codigoProyecto, String tipoProyecto) {
        this.nombre = nombre;
        this.pais = pais;
        this.localizacion = localizacion;
        this.codigoProyecto = codigoProyecto;
        this.tipoProyecto = tipoProyecto;
    }

    public Proyecto(String nombre, String pais, String localizacion, Date fechaInicio, Date fechaFin, String socioLocal, String financiador, float financiacionaportada, int codigoProyecto, String tipoProyecto, String personalAsignado) {
        this.nombre = nombre;
        this.pais = pais;
        this.localizacion = localizacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.socioLocal = socioLocal;
        this.financiador = financiador;
        this.financiacionaportada = financiacionaportada;
        this.codigoProyecto = codigoProyecto;
        this.tipoProyecto = tipoProyecto;
        this.personalAsignado = personalAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getSocioLocal() {
        return socioLocal;
    }

    public void setSocioLocal(String socioLocal) {
        this.socioLocal = socioLocal;
    }

    public String getFinanciador() {
        return financiador;
    }

    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    public float getFinanciacionaportada() {
        return financiacionaportada;
    }

    public void setFinanciacionaportada(float financiacionaportada) {
        this.financiacionaportada = financiacionaportada;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public LineaAccion getLineaAccion() {
        return lineaAccion;
    }

    public void setLineaAccion(LineaAccion lineaAccion) {
        this.lineaAccion = lineaAccion;
    }

    public String getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(String personalAsignado) {
        this.personalAsignado = personalAsignado;
    }
}
