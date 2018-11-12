package com.iesemilidarder.pvidal.data;

import java.util.Date;

public class Hotel extends Producto {
    private Integer plazasHabitacion;
    private Date horariosComida;
    private String servicios;
    private String eventos;
    private String disponivilidad;

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getEventos() {
        return eventos;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }

    public String getDisponivilidad() {
        return disponivilidad;
    }

    public void setDisponivilidad(String disponivilidad) {
        this.disponivilidad = disponivilidad;
    }

    public Integer getPlazasHabitacion() {
        return plazasHabitacion;
    }

    public void setPlazasHabitacion(Integer plazasHabitacion) {
        this.plazasHabitacion = plazasHabitacion;
    }

    public Date getHorariosComida() {
        return horariosComida;
    }

    public void setHorariosComida(Date horariosComida) {
        this.horariosComida = horariosComida;
    }
}
