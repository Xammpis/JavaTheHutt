package com.javathehutt.ONG;

import java.util.List;

public class LineaAccion   {

    private final TipoProyecto nombre;

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
