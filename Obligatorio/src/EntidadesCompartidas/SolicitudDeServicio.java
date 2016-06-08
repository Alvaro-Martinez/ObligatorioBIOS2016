/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;
import java.util.Date;
/**
 *
 * @author DIEGO
 */
public class SolicitudDeServicio {
    private int NroSerie;
    private Date FechaHora;
    private String Direccion;
    private boolean Cancelada;
    
    private Vehiculo refVehiculo;
    private Operario[] refOperarios;
    private Grua refGrua;   

    public int getNroSerie() {
        return NroSerie;
    }

    public void setNroSerie(int NroSerie) {
        this.NroSerie = NroSerie;
    }

    public Date getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Date FechaHora) {
        this.FechaHora = FechaHora;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public boolean isCancelada() {
        return Cancelada;
    }

    public void setCancelada(boolean Cancelada) {
        this.Cancelada = Cancelada;
    }
    
    public Vehiculo getRefVehiculo() {
        return refVehiculo;
    }

    public void setRefVehiculo(Vehiculo refVehiculo) {
        this.refVehiculo = refVehiculo;
    }

    public Operario[] getRefOperarios() {
        return refOperarios;
    }

    public void setRefOperarios(Operario[] refOperarios) {
        this.refOperarios = refOperarios;
    }

    public Grua getRefGrua() {
        return refGrua;
    }

    public void setRefGrua(Grua refGrua) {
        this.refGrua = refGrua;
    }
    
    public SolicitudDeServicio(int NroSerie, Date FechaHora, String Direccion, boolean Cancelada, Vehiculo refVehiculo, Operario[] refOperarios, Grua refGrua) {
        this.NroSerie = NroSerie;
        this.FechaHora = FechaHora;
        this.Direccion = Direccion;
        this.Cancelada = Cancelada;
        this.refVehiculo = refVehiculo;
        this.refOperarios = refOperarios;
        this.refGrua = refGrua;
    }    
    
}
