package com.iesemilidarder.pvidal;

import java.util.Date;

public class Viaje extends Producto {

    private String pais;
    private String servicios;
    private Date horario;
    private Integer plazas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }
}
