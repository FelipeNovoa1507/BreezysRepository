package Modelo;

import Modelo.Cliente;
import Modelo.Equipo;
import java.util.Date;

public class Venta {
    private Cliente cliente;
    private Equipo equipo;
    private Date fechaHora;

    public Venta(Cliente cliente, Equipo equipo) {
        this.cliente = cliente;
        this.equipo = equipo;
        this.fechaHora = new Date();
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
