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
public class AuxMecanico extends Servicio {
    private double CostoRepuestos;
    private String DescripcionProblema;
    private String DescripcionReparacion;

    public double getCostoRepuestos() {
        return CostoRepuestos;
    }

    //comentario prueba
    public void setCostoRepuestos(double CostoRepuestos) {
        this.CostoRepuestos = CostoRepuestos;
    }

    public String getDescripcionProblema() {
        return DescripcionProblema;
    }

    public void setDescripcionProblema(String DescripcionProblema) {
        this.DescripcionProblema = DescripcionProblema;
    }

    public String getDescripcionReparacion() {
        return DescripcionReparacion;
    }

    public void setDescripcionReparacion(String DescripcionReparacion) {
        this.DescripcionReparacion = DescripcionReparacion;
    }

    public AuxMecanico(int NroSerie, SolicitudDeServicio refSolicitud, double CostoRepuestos, String DescripcionProblema, String DescripcionReparacion) {
        super(NroSerie, refSolicitud);
        this.CostoRepuestos = CostoRepuestos;
        this.DescripcionProblema = DescripcionProblema;
        this.DescripcionReparacion = DescripcionReparacion;
    }
    
    @Override
    protected double CalcularImporte(){
        double importe = 0;
        return importe;
    }
     
}
