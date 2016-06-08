/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;

/**
 *
 * @author DIEGO
 */
public abstract class Servicio {
    private int NroSerie;
    private double ImporteTotal;
    
    private SolicitudDeServicio refSolicitud;

    public int getNroSerie() {
        return NroSerie;
    }

    public void setNroSerie(int NroSerie) {
        this.NroSerie = NroSerie;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }    

    public Servicio(int NroSerie, SolicitudDeServicio refSolicitud) {
        this.NroSerie = NroSerie;
        this.refSolicitud = refSolicitud;
        this.ImporteTotal = CalcularImporte();
    }

    public SolicitudDeServicio getRefSolicitud() {
        return refSolicitud;
    }

    public void setRefSolicitud(SolicitudDeServicio refSolicitud) {
        this.refSolicitud = refSolicitud;
    }   
    
    protected abstract double CalcularImporte();    
}
